package Data;

public class Prateleira {
	private Produto produto1;
	private Produto produto2;
	private Produto produto3;
	public int n_produtos= 0;

	public Prateleira() {}
		
	public Prateleira(Produto produto1, Produto produto2, Produto produto3) {
		this.setProduto1(produto1);
		this.setProduto2(produto2);
		this.setProduto3(produto3);
	}

	public Prateleira(Produto produto1, Produto produto2) {
		this.setProduto1(produto1);
		this.setProduto2(produto2);
	}

	public Prateleira(Produto produto1) {
		this.setProduto1(produto1);
	}

	@Override
	public String toString() {
		return "Prateleira [produto1=" + produto1 + ", produto2=" + produto2 + ", produto3=" + produto3 + "]";
	}

	public Produto getProduto1() {
		return produto1;
	}

	public void setProduto1(Produto produto1) {
		this.produto1 = produto1;
		this.n_produtos = 1;
	}

	public Produto getProduto2() {
		return produto2;
	}

	public void setProduto2(Produto produto2) {
		this.produto2 = produto2;
		this.n_produtos += 1;
	}

	public Produto getProduto3() {
		return produto3;
	}

	public void setProduto3(Produto produto3) {
		this.produto3 = produto3;
		this.n_produtos += 1;
	}

	public Produto produtoMaisCaro() {
		Produto maiscaro = produto1;
		if (this.n_produtos == 3) {
			
			if (this.produto2.getPreco() > this.produto3.getPreco()
			&& this.produto2.getPreco() > this.produto1.getPreco()) {
				maiscaro = produto2;

			} else if (this.produto3.getPreco() > this.produto2.getPreco()
					&& this.produto3.getPreco() > this.produto1.getPreco()) {
				maiscaro = produto3;
			}
		}
		else if (this.n_produtos == 2){
			if(this.produto2.getPreco() > this.produto1.getPreco()){
				maiscaro = produto2;
			}
		}
		return maiscaro;

	}
}
