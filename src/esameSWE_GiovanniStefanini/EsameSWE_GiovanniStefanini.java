package esameSWE_GiovanniStefanini;

import java.util.Scanner;

public class EsameSWE_GiovanniStefanini {
	
	 public static void main(String[] args) {
		 String nomePresidente;
		 String nomeAllenatore;
		 String nomeDottore;
		 String nomeSquadra;
		 int numGiocatoriSq;
		 int categoriaScelta;
		 System.out.println("Inizio");
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Inserisci nome Presidente: ");
		 nomePresidente = input.nextLine();
		 System.out.println("Inserisci nome Allenatore: ");
		 nomeAllenatore = input.nextLine();
		 System.out.println("Inserisci nome Dottore: ");
		 nomeDottore = input.nextLine();
		 System.out.println("Inserisci nome Squadra: ");
		 nomeSquadra = input.nextLine();
		 System.out.println("Inserisci numero giocatori per Squadra: ");
		 numGiocatoriSq = input.nextInt();
		 System.out.println("Inserisci categoria a cui si vuole partecipare 1 = juniores e qualsiasi Intero = seniores: ");
		 categoriaScelta = input.nextInt();

		 Presidente presidente = Presidente.getInstance(nomePresidente); 
		    
		 Dottore dottoreQualsiasi = presidente.sceglieDottore(nomeDottore); 
		 Allenatore allenatoreQualsiasi = presidente.sceglieAllenatore(nomeAllenatore);
		 
		 Squadra squadraQualsiasi = new Squadra(nomeSquadra, allenatoreQualsiasi, dottoreQualsiasi, numGiocatoriSq);
		 
		 Campionato campionatoQualsiasi = new Campionato();
		 if(categoriaScelta == 1) {
			 Juniores categoriaQualsiasi = new Juniores();
			 campionatoQualsiasi.setMetodoDiStrategy(categoriaQualsiasi);
			 campionatoQualsiasi.doMetodoDiStrategy(squadraQualsiasi);
		 } else {
			 Seniores categoriaQualsiasi = new Seniores();
			 campionatoQualsiasi.setMetodoDiStrategy(categoriaQualsiasi);
			 campionatoQualsiasi.doMetodoDiStrategy(squadraQualsiasi);		
		 }
		 Consiglio consiglioQualsiasi = new Consiglio();
		 consiglioQualsiasi.produciResoconto(campionatoQualsiasi);
		 presidente.confermaOModificaStaff(consiglioQualsiasi);
		 System.out.println("Fine");
		 
	 }
}









