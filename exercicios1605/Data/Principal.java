package unisinos.Data;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		/*
		 * crie uma prateleira com 3 produtos, conforme listagem abaixo: o Produto
		 * 1:amaciante, preço solicitado pelo Teclado, validade 10/4/2014 Produto 2:
		 * creme dental, preço solicitado pelo Teclado, validade 5/5/2015 Produto
		 * 3:leite condensado, preço solicitado pelo Teclado, validade 4/12/2012
		 * Atenção: garanta que o preço de cada produto será maior do que zero
		 */
		Scanner scanner = new Scanner(System.in);

		Data venc1 = new Data(10, 4, 2014);
		Data venc2 = new Data(5, 5, 2015);
		Data venc3 = new Data(4, 12, 2012);

		Produto amaciante = new Produto("Amaciante", 0, venc1);
		Produto creme_dental = new Produto("Creme dental", 0, venc2);
		Produto leite_condensado = new Produto("Leite condensado", 0, venc3);

		while (true) {
		 	System.out.println("Qual o preço do amaciante?");
		 	float preco_amaciante = scanner.nextFloat();
		 	if (preco_amaciante > 0) {
		 		amaciante.setPreco(preco_amaciante);
		 		break;
		 	}
		 	System.out.println("O valor deve ser maior que 0");
		}
		 while (true) {
		 	System.out.println("Qual o preço do creme dental?");
		 	float preco_creme = scanner.nextFloat();
		 	if (preco_creme > 0) {
		 		creme_dental.setPreco(preco_creme);
		 		break;
		 	}
			System.out.println("O valor deve ser maior que 0");
		}
		while (true) {
		 	System.out.println("Qual o preço do leite condensado?");
		 	float preco_leite = scanner.nextFloat();
		 	if (preco_leite > 0) {
		 		leite_condensado.setPreco(preco_leite);
		 		break;
		 	}
		 	System.out.println("O valor deve ser maior que 0");
		}
		Prateleira prateleira1 = new Prateleira(amaciante, creme_dental, leite_condensado);
		Prateleira prateleira2 = new Prateleira();
		Data venc4 = new Data(13, 10, 2025);
		Produto cortina = new Produto("cortina", 167.98f, venc4);
		prateleira2.setProduto1(cortina);
		Mercado mercado = new Mercado(prateleira1, prateleira2);
		Data data_vencimento = new Data(10, 10, 2014);

		if (amaciante.VerificaProdutoVencido(data_vencimento)) {
		 	System.out.println("Amaciante está vencido");
		}
		if (creme_dental.VerificaProdutoVencido(data_vencimento)) {
		 	System.out.println("Creme dental está vencido");
		}
		if (leite_condensado.VerificaProdutoVencido(data_vencimento)) {
			System.out.println("Leite condensado está vencido");
		}
		if (cortina.VerificaProdutoVencido(data_vencimento)) {
		 	System.out.println("Cortina está vencido");
		}

		Produto maiscaro_prateleira_1 = prateleira1.produtoMaisCaro();

		Produto maiscaro_prateleira_2 = prateleira2.produtoMaisCaro();
	
		if (maiscaro_prateleira_1.getPreco() > maiscaro_prateleira_2.getPreco()){
			System.out.println("O produto mais caro é " + maiscaro_prateleira_1);
		}

		else if(maiscaro_prateleira_1.getPreco() < maiscaro_prateleira_2.getPreco()){
			System.out.println("O produto mais caro é " + maiscaro_prateleira_2);
		}

		else{
			System.out.println("Os produto mais caros são " + maiscaro_prateleira_1 + maiscaro_prateleira_2);
		}
		
		System.out.printf("Média do preço dos produtos: %.2f", mercado.mediaValorProdutos());
	}
}
