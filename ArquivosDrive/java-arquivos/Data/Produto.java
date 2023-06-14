package Data;

public class Produto {
	private String nome;
	private float preco;
	private Data vencimento;
	
	public Produto() {}
	
	public Produto(String nome, float preco, Data date) {
		this.setNome(nome);
		this.setPreco(preco);
		this.setVencimento(date);
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", vencimento=" + vencimento + "]";
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Data getVencimento() {
		return vencimento;
	}

	public void setVencimento(Data date) {
		this.vencimento = date;
	} 
	
	public Boolean VerificaProdutoVencido(Data hoje) {
		if (hoje.getAno() > this.vencimento.getAno()) {
			return true;
		}
		else if (hoje.getMes() > this.vencimento.getMes() && hoje.getAno() == this.vencimento.getAno()) {
			return true;
		}
		else if (hoje.getDia() > this.vencimento.getDia() && hoje.getMes() == this.vencimento.getMes() && hoje.getAno() == this.vencimento.getAno() ) {
			return true;
		}
		return false;
	}
	
}
