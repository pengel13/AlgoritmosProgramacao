package unisinos.Data;

public class Mercado {
	private Prateleira prateleira1;
	private Prateleira prateleira2;

	public Mercado(Prateleira prateleira1, Prateleira prateleira2) {
		this.prateleira1 = prateleira1;
		this.prateleira2 = prateleira2;

	}

	public Prateleira getPrateleira1() {
		return prateleira1;
	}

	public Prateleira getPrateleira2() {
		return prateleira2;
	}

	public float mediaValorProdutos() {
		int quantidade = prateleira1.n_produtos + prateleira2.n_produtos;
		float soma = 0;
		if (prateleira1.n_produtos == 3) { // dá pra fazer um switch case aqui tb.
			soma = prateleira1.getProduto1().getPreco() + prateleira1.getProduto2().getPreco()
					+ prateleira1.getProduto3().getPreco();
		} else if (prateleira1.n_produtos == 2) {
			soma = prateleira1.getProduto1().getPreco() + prateleira1.getProduto2().getPreco();
		} else if (prateleira1.n_produtos == 1) {
			soma = prateleira1.getProduto1().getPreco();
		}
		if (prateleira2.n_produtos == 3) {
			soma += prateleira2.getProduto1().getPreco() + prateleira2.getProduto2().getPreco()
					+ prateleira2.getProduto3().getPreco();
		} else if (prateleira2.n_produtos == 2) {
			soma += prateleira2.getProduto1().getPreco() + prateleira2.getProduto2().getPreco();
		} else if (prateleira2.n_produtos == 1) {
			soma += prateleira2.getProduto1().getPreco();
		}
		return soma / quantidade;

	}
}
