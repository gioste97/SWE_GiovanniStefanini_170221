package esameSWE_GiovanniStefanini;

public final class Dottore extends Staff implements Observer  {

	private boolean statoCheIlDocVede; 
	private int numInfortuni = 0;
	
	public static final boolean INFORTUNATO = false;
	public static final boolean inFORMA = true;

	public Dottore (String nome) {	
		super(nome);
	}

	public void update(Subject concreteSubject) {	
		this.statoCheIlDocVede = ((Giocatore)concreteSubject).getState();
		if(statoCheIlDocVede == INFORTUNATO) {
			System.out.println("Un giocatore va da "+this.nome+" perchè da in FORMA è diventato INFORTUNATO");
			contaInfortuni(); 
			operazioneSpecificaStaff();
		}		
	}	
	
	public void contaInfortuni() {
		numInfortuni ++;
		System.out.println("Numero infortuni aumenta, quindi sono: " + numInfortuni);
	}
	
	@Override
	public void operazioneSpecificaStaff() {
		System.out.println("Dottore visita il paziente");
	}
	
	public int getNumInfortuni() {
		return numInfortuni;
	}
	
	public boolean getStatoCheIlDocVede() {
		return statoCheIlDocVede;
	}
}
