package esameSWE_GiovanniStefanini;

public final class Presidente {
	private static Presidente instanza = null;
	protected String nome;
	
    private Presidente(String nome) { 
        this.nome = nome;
        System.out.println("Presidente creato: " + nome);
    } 

    public static final Presidente getInstance(String name) { 
        if (instanza == null) 
            instanza = new Presidente(name); 
        return instanza; 
    }
      
    public Dottore sceglieDottore(String nomeDoc) {
		 Dottore dottoreScelto = new Dottore(nomeDoc);
		 return dottoreScelto;
    }
    
    public Allenatore sceglieAllenatore(String nomeCoach) {
		 Allenatore allenatoreScelto = new Allenatore(nomeCoach);
		 return allenatoreScelto;
    }
    
    public char confermaOModificaStaff(Consiglio consiglio) {
    	char decisione;
    	String resocontoConsiglio = consiglio.getResoconto();
    	if(resocontoConsiglio == "Confermato") {
    		System.out.println("Lo Staff può essere riconfermato per il prossimo campionato");
    		decisione = 'c';
    	} else {
    		System.out.println("Lo Staff deve essere modificato per il prossimo campionato");
    		decisione = 'm';
    	}	
    	return decisione;
    }
    
}
