package esameSWE_GiovanniStefanini;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampionatoTest { 
	private Campionato camp;
	private Dottore doc; 
	private Allenatore all;
	private Squadra sq;
	private int numGiocSq;
	
	@BeforeEach
	public void initialize() {
		camp = new Campionato();
		doc = new Dottore("Doc. D"); 
		all = new Allenatore ("All. A");
		numGiocSq = 10;
		sq = new Squadra("Sq. T", all, doc, numGiocSq);
	}
	
	@Test
	public void setMetodoDiStrategy() {
		Seniores strategy = new Seniores();
		
		camp.setMetodoDiStrategy(strategy);
		assertEquals(camp.getStrategy(), strategy); 
	}	
	@Test
	public void doMetodoDiStrategTestS() {
		//Testa un campionato Seniores
		Campionato campSeniores = new Campionato();
		
		Seniores strategyS = new Seniores();
		
		campSeniores.setMetodoDiStrategy(strategyS);
		campSeniores.doMetodoDiStrategy(sq);
		assertNotNull(campSeniores);
	}
	@Test
	public void doMetodoDiStrategyTestJ() {		
		Campionato campJuniores = new Campionato();
		
		Seniores strategyJ = new Seniores();
		
		campJuniores.setMetodoDiStrategy(strategyJ);
		campJuniores.doMetodoDiStrategy(sq);
		assertNotNull(campJuniores);
	}

}
