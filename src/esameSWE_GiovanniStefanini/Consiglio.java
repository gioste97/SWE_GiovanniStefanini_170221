package esameSWE_GiovanniStefanini;

public final class Consiglio {
	
	private String giudizio;
	private String resoconto;

	public void produciResoconto(Campionato campionato) {
		Categoria categoria = campionato.getStrategy();
		int contatorePartiteVinte = categoria.getNumPartiteVCampionato();
		int contatoreInfortuni = categoria.getNumInfCampionato();
		
		double numCasuale = (int)(Math.random()*10); 
		if(numCasuale<7) { 
			giudizio = "POSITIVO";		 
		} else giudizio = "NEGATIVO";
		System.out.println("Giudizio è " +giudizio);
		
		if(contatorePartiteVinte>6 && contatoreInfortuni<70 && giudizio == "POSITIVO") { 
			resoconto = "Confermato";
		} else if(contatorePartiteVinte>10 && contatoreInfortuni<50 && giudizio == "NEGATIVO") {
			resoconto = "Confermato";
		} else resoconto = "Negato";
		
		System.out.println("Resoconto è " +resoconto);
	}
	
	public String getResoconto() {
		return resoconto;
	}
	
}
