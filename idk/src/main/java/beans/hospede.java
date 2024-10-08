package beans;

public class hospede {
	private String nome;
	private double dias;
	
	
	public hospede(String nome, double notaSprint, double notaCp) {
		this.nome = nome;
		this.dias = notaSprint;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public double calcular() {
		double valor=350.0;
		return valor / (this.dias);
		
	}

	public double getDias() {
		return dias;
	}

	public void setDias(double dias) {
		this.dias = dias;
	}
	
	

}
