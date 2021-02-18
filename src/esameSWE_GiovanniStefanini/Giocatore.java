package esameSWE_GiovanniStefanini;

public final class Giocatore extends Subject{

	public static final boolean inFORMA = true;
	public static final boolean INFORTUNATO = false;
	
	private boolean stateGioc;			                        
	private int id; 
	
	public Giocatore(int i) {	
		this.id=i;
		stateGioc = inFORMA;
	}
	
	public boolean getState() {	
		return stateGioc;
	}

	public void setStatePullMode(boolean state) {	
		this.stateGioc=state;
		setChanged();
		notifyObservers(); 					
	}

	
	public void verificaStatoPostPartita(){ 
		 double numCasuale = (int)(Math.random()*100); 
		 if(numCasuale<10) { 
			 setStatePullMode(INFORTUNATO);
		 }
		 setStatePullMode(inFORMA); 
	}

}
