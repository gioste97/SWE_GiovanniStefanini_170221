package esameSWE_GiovanniStefanini;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PresidenteTest {
	private Presidente pres;
	private String nomeDot; 
	private String nomeAll; 
	private Consiglio cons;
	
	@BeforeEach
	public void initialize() {
		pres = Presidente.getInstance("Presidente");
		nomeDot = "Dot";
		nomeAll = "All";
		cons = new Consiglio();
	}
	
	@Test
	public void getInstanceTest() {  
		Presidente presidenteTest = Presidente.getInstance("Presidente Test");
		assertSame(pres, presidenteTest);
	}
	
	@Test
	public void sceglieDottoreTest() {
		Dottore dot;
		dot = pres.sceglieDottore(nomeDot);
		assertEquals(nomeDot, dot.getName());
	}
	@Test
	public void sceglieAllenatoreTest() {
		Allenatore all;
		all = pres.sceglieAllenatore(nomeAll);
		assertEquals(nomeAll, all.getName());
	}
	@Test
	public void confermaOModificaStaffTest() {
		Squadra sq = new Squadra("Sq N", new Allenatore("All"), new Dottore("Dot"), 10);
		Campionato camp = new Campionato();
		Juniores cat = new Juniores();
		camp.setMetodoDiStrategy(cat);
		camp.doMetodoDiStrategy(sq);

		cons.produciResoconto(camp);
		pres.confermaOModificaStaff(cons);

		assertNotNull(pres.confermaOModificaStaff(cons));
	} 

}
