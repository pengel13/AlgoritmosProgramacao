package heranca3;

public class Mamifero extends Animal{
	public String alimento;

	public void alteraAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	
	
	public Mamifero(String nome, String cor, String alimento, int comprimento, float velocidade, int patas) {
		super(nome, comprimento, patas, cor, "Terra", velocidade );
		this.alimento = alimento;
	}
	
	public void dados() {
		System.out.println("Mamifero [nome=" + nome + ", comprimento=" + comprimento + ", patas=" + patas + ", cor=" + cor
				+ ", ambiente=" + ambiente + ", velocidade=" + velocidade + ", alimento=" + alimento + "]");
	}
	
	
}