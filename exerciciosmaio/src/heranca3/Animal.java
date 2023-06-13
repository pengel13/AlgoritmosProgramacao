package heranca3;

public class Animal {
	public String nome;
	public int comprimento;
	public int patas;
	public String cor;
	public String ambiente;
	public float velocidade;

	public void dados() {
		System.out.println("Animal [nome=" + nome + ", comprimento=" + comprimento + ", patas=" + patas + ", cor=" + cor
				+ ", ambiente=" + ambiente + ", velocidade=" + velocidade + "]");
	}
	
	public Animal() {}

	public Animal(String nome, int comprimento, int patas, String cor, String ambiente, float velocidade) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}

	public void alteraNome(String nome) {
		this.nome = nome;
	}

	public void alteraComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public void alteraPatas(int patas) {
		this.patas = patas;
	}

	public void alteraCor(String cor) {
		this.cor = cor;
	}

	public void alteraAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public void alteraVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	

}
