package produto;

public class Livro extends Produto {
	private String autor;

	public Livro() {
		super();
	}
	
	public Livro(float preco, String nomeloja, String descricao, String autor) {
		super(preco, nomeloja, descricao);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setTipo(String autor) {
		this.autor = autor;
	}

	@Override
	public String getDescricao() {
		return this.getAutor() + super.getDescricao();
	}

}
