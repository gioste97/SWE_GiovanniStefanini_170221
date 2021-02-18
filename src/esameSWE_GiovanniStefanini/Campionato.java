package esameSWE_GiovanniStefanini;

public final class Campionato {
	
	private Categoria strategy; 
	
	public void setMetodoDiStrategy(Categoria categoriaStrategy) {
		this.strategy = categoriaStrategy;		
	}   
	public Categoria getStrategy() {
		return strategy; 	     
	}   
	public void doMetodoDiStrategy(Squadra squadra){
		strategy.giocaCampionato(squadra); 
	}
}
