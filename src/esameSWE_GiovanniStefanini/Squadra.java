package esameSWE_GiovanniStefanini;

import java.util.ArrayList;

public final class Squadra {
	
	protected String nome;
	private int numGiocatoriPerSquadra;
	private ArrayList<Giocatore> giocatoriSquadra;
	private Allenatore allenatoreSquadra;
	private Dottore dottoreSquadra;
	
	public Squadra(String nome, Allenatore allenatoreSquadra, Dottore dottoreObsPull, int numGiocatoriSq) { 
        this.nome = nome;
        giocatoriSquadra = new ArrayList<Giocatore>();
        this.allenatoreSquadra = allenatoreSquadra;
        this.dottoreSquadra = dottoreObsPull;
        this.numGiocatoriPerSquadra = numGiocatoriSq;
        for(int i=0; i < numGiocatoriPerSquadra; i++) {
        	giocatoriSquadra.add(new Giocatore(i));
        }
        registraDocAGiocatori(dottoreObsPull);
    }
	
	public void registraDocAGiocatori(Dottore dottoreObsPull) {
		 for(int i=0; i < giocatoriSquadra.size(); i++) {
			 giocatoriSquadra.get(i).addObserver(dottoreObsPull); 
		 }
	}
	
	public ArrayList<Giocatore> getArrayGiocatori(){
		return giocatoriSquadra;
	}
		
	public Allenatore getAllSquadra() {
		return allenatoreSquadra;
	}
	
	public Dottore getDotSquadra() {
		return dottoreSquadra;
	}
	
}
