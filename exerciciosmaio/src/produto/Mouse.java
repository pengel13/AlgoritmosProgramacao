package produto;

public class Mouse extends Produto {
	private String tipo;
	
	public Mouse(float preco, String nomeloja, String descricao, String tipo) {
		super(preco, nomeloja, descricao);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String getDescricao() {
		return this.getTipo() + super.getDescricao();
	}
	
}
