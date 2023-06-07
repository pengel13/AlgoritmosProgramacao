package produto;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Produto> carrinho = new ArrayList<>();
		Mouse m1 = new Mouse(100.95f, "Americanas", "Mouse ótico", "Samsung ");
		carrinho.add(m1);
		System.out.println(m1.getDescricao());

	}
}
