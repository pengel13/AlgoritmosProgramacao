package AssociacaoFuncionario;

import java.util.Scanner;

public class Posto {
	public static int Menu() {
		System.out.println("Bom dia! Digite o número do que você vai querer fazer hoje: "
				+ "\n1) Registrar novo valor do litro de gasolina" + "\n2) Registrar nova compra"
				+ "\n3) Ver quantos litros já foram vendidos" + "\n4) Ver quantos reais foram faturados"
				+ "\n5) Encerrar o dia e gerar o relatório do dia");
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		scanner.close();
		return opcao;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		float precoGasolina = 0;
		float litros = 0;
		do {
			x = Posto.Menu();
			if (x <= 5 || x >= 1) {
				switch (x) {
				case 1:
					System.out.println("Digite o preço do litro da gasolina em reais:");
					precoGasolina = scanner.nextFloat();
					continue;
				case 2:
					System.out.println(("Digite quantos litros de gasolina foram inseridas:"));
					float litro = scanner.nextFloat();
					litros += litro;
					continue;
				case 3:
					System.out.println("Já foram vendidos " + litros + " litros.");
					continue;
				case 4:
					System.out.println("Já foi faturado " + litros * precoGasolina + " reais.");
					continue;
				case 5:
					break;
				default:
					System.out.println("Valor Inválido. Tente novamente.");
				}
			}
		} while (x != 5);

		System.out.println("No dia de hoje, o preço da gasolina era de " + precoGasolina + " reais.");
		System.out.println("A esse preço foram vendidos " + litros + " litros de gasolina.");
		System.out.println("Ou seja, resultando num total de " + litros * precoGasolina + " reais");
		scanner.close();

	}

}
