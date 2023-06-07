package produto;

public class Produto {
	private float preco;
	private String nomeloja;
	private String descricao = "Produto de Informática";

	public Produto(float preco, String nomeloja, String descricao) {
		super();
		this.preco = preco;
		this.nomeloja = nomeloja;
		this.descricao = descricao;
	}

	public Produto() {}

	public String getDescricao() {
		return descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getNomeloja() {
		return nomeloja;
	}

	public void setNomeloja(String nomeloja) {
		this.nomeloja = nomeloja;
	}

}
