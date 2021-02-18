package esameSWE_GiovanniStefanini;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class GiocatoreTest {

	public static final boolean inFORMA = true;
	public static final boolean INFORTUNATO = false;
	private Giocatore gioc;
	private Dottore dot;
	private int id;
	
	@BeforeEach
	public void initialize() {
		id = 1;
		gioc = new Giocatore(id); 
		dot = new Dottore("Dot");
		gioc.addObserver(dot);
	}
	@Test
	public void setStatePullModeTest1() {
		gioc.setStatePullMode(false);
		assertFalse(gioc.getState());
	}
	
	@Test
	public void setStatePullModeTest2() {
		gioc.setStatePullMode(false);
		assertFalse(dot.getStatoCheIlDocVede());
	}
	
	@Test
	public void setStatePullModeTest3() {
		gioc.setStatePullMode(false);
		assertEquals(gioc.getState(), dot.getStatoCheIlDocVede());
	}

	@Test
	public void verificaStatoPostPartitaTest() {
		gioc.verificaStatoPostPartita();
		assertEquals(gioc.getState(), dot.getStatoCheIlDocVede());
	}
	
	@AfterEach
	public void setStateGioc() {
		gioc.setStatePullMode(true);
	}

}
