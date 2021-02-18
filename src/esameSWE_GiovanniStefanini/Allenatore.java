package esameSWE_GiovanniStefanini;

public final class Allenatore extends Staff {

	private int allenamento; 
	
	public Allenatore(String nome) {
		super(nome);
	}
	
	public int creaAllenamento(char partita) {
		operazioneSpecificaStaff();
		
		if(partita =='S') {
			allenamento = 1;
			System.out.println("Allenamento sulla Difesa");
		} else if(partita == 'V') {
			allenamento = 2;
			System.out.println("Allenamento sull'Attacco");
		} else {
			allenamento = 3;
			System.out.println("Allenamento sulla Tecnica individuale");
		}
		return allenamento;
	}
	
	@Override
	public void operazioneSpecificaStaff() {
		System.out.println("Allenatore pensa al tipo di allenamento");
	}
}
