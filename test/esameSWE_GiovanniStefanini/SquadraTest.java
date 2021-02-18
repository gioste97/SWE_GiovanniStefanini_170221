package esameSWE_GiovanniStefanini;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class SquadraTest {

	private Squadra sq;
	private ArrayList<Giocatore> giocatoriSquadra;
	private int numGSq;
	private Dottore dotSq;
	
	@BeforeEach
	public void initialize() {
		dotSq = new Dottore("Dot");
		numGSq = 10;
		sq = new Squadra("nomeSq", new Allenatore("All"), dotSq, numGSq);
		giocatoriSquadra = sq.getArrayGiocatori();
	}
	@Test
	public void registraDocAGiocatoriTest1() {
		for(int i=0; i < giocatoriSquadra.size(); i++) {
			giocatoriSquadra.get(i).setStatePullMode(false);
			assertFalse(giocatoriSquadra.get(i).getState()); 
		}
	}

	@Test
	public void registraDocAGiocatoriTest2() {
		for(int i=0; i < giocatoriSquadra.size(); i++) {
			giocatoriSquadra.get(i).setStatePullMode(false);
			assertFalse(dotSq.getStatoCheIlDocVede());
		}
	}
	@Test
	public void registraDocAGiocatoriTest3() {
		for(int i=0; i < giocatoriSquadra.size(); i++) {
			giocatoriSquadra.get(i).setStatePullMode(false);
			assertEquals(dotSq.getStatoCheIlDocVede(), giocatoriSquadra.get(i).getState());
		}
	}
}
