package esameSWE_GiovanniStefanini;

public abstract class Staff {
	
	protected String nome;
	
	public Staff(String nome) { 
        this.nome = nome;
        System.out.println("Nome Staff ingaggiato: " + nome);
    }
	
	public void operazioneSpecificaStaff() {
		System.out.println("lo staff si consulta");
	}
	
	public String getName() {
		return nome;
	}	
}
