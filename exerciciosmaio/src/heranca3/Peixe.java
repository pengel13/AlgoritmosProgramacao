package heranca3;

public class Peixe extends Animal {
	public String caracteristica;

	public Peixe() {
	}

	public Peixe(String nome, int comprimento, float velocidade, String caracteristica) {
		super(nome, comprimento, 0, "Cinzenta", "mar", velocidade);
		this.caracteristica = caracteristica;
	}

	public void dados() {
		System.out.println("Peixe [nome=" + nome + ", comprimento=" + comprimento + ", patas=" + patas + ", cor=" + cor
				+ ", ambiente=" + ambiente + ", velocidade=" + velocidade + ", caracteristicas = " + caracteristica
				+ "]");
	}

	public void alteraCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
}
