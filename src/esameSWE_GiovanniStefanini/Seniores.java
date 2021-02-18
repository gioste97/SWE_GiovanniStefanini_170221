package esameSWE_GiovanniStefanini;

public final class Seniores implements Categoria {	
	private int contatorePartiteVinte;
	private int contatoreInfortuni;
	
	@Override
	public void giocaCampionato(Squadra squadra) {
		System.out.println("INIZIO Campionato Seniores si gioca 25 partite");
		char risUltimaPartita;
		for(int i=0; i<25; i++) {
			System.out.println("Partita n° " +i);
			risUltimaPartita = giocaUnaPartita();
			if (risUltimaPartita == 'V') {
				contatorePartiteVinte++;
			}
			System.out.println("Risultato ultima partita: " + risUltimaPartita);
			
			for(int j=0; j < squadra.getArrayGiocatori().size(); j++) { 
				squadra.getArrayGiocatori().get(j).verificaStatoPostPartita(); 
			}	
			squadra.getAllSquadra().creaAllenamento(risUltimaPartita);
			System.out.println("------------------------");			
		}
		System.out.println("Numero partite vinte nel campionato: " + contatorePartiteVinte);
		System.out.println("Numero infortuni: " + squadra.getDotSquadra().getNumInfortuni());
		
		contatoreInfortuni = squadra.getDotSquadra().getNumInfortuni();
	}
	
	@Override
	public char giocaUnaPartita() {
		 char risPartita;
		 double numCasuale = (int)(Math.random()*10); //crea un numero casuale da 1 a 10
		 if(numCasuale<3) { 
			 risPartita = 'S';
		 } else if(numCasuale<8) { 
			 risPartita = 'V';
		 } else risPartita = 'P';
		return risPartita;
	}
	
	@Override
	public int getNumInfCampionato() {
		return contatoreInfortuni;
	}
	
	@Override
	public int getNumPartiteVCampionato() {
		return contatorePartiteVinte;
	}
}
