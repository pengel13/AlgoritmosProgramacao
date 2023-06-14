package aula0805;

import java.util.Scanner;

public class Menu {
	public static void RaizQuadrada() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("A raiz quadrada é uma operação básica e importante da Matemática. "
				+ "\nSe trata da operação inversa da exponenciacao. "
				+ "\nAssim, calcular a raiz quadrada de um número n é descobrir qual número elevado ao quadrado resulta em n. "
				+ "\nPor exemplo, a raiz quadrada de 9 é igual a 3, pois, 3² é 9.");
		System.out.println("Vamos praticar!");
		int res = 0;
		do {
			System.out.println("Digite a raiz de 25:");
			res = scanner.nextInt();
			if (res == 5) {
				System.out.println("Parabéns, você aprendeu raiz quadrada!");
				break;
			}
			System.out.println("Resposta errada! Pense em algum número que multiplicado por ele mesmo é 25");
		} while (res != 5);
	}

	

	public static void Exponenciacao() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("A  exponenciação é a operação matemática que representa a multiplicação de fatores iguais. "
				+ "\nOu seja, usamos a exponenciação quando um número é multiplicado por ele mesmo várias vezes.");

		System.out.println("Um exemplo é o seguinte: 3² é 3 multiplicado por ele mesmo 2 vezes.");
		System.out.println("Tente agora você!\n");
		int res = 0;
		do {
			System.out.println("5²:");
			res = scanner.nextInt();
			if (res == 25) {
				System.out.println("Parabéns, você aprendeu exponenciação!");
				break;
			}
			System.out.println("Resposta errada! Lembre: 5² é a mesma coisa que 5x5");
		} while (res != 25);
	}

	public static void Seno() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("O Seno de qualquer ângulo é o valor que encontramos ao dividir o seu cateto oposto pela hipotenusa.");
		System.out.println("Seno é um valor que é dificil de calcular a mão. Digite um ângulo e eu direi seu seno");
		float seno = scanner.nextFloat();
		System.out.println("O seno de " +seno+ " é " + Math.sin(seno));
	}

	public static void Cosseno() {
		System.out.println("O cosseno de um ângulo é a razão entre a medida do cateto adjacente e a medida da hipotenusa");
		System.out.println("Cosseno é um valor que é dificil de calcular a mão. Digite um ângulo e eu direi sua tangente");
		Scanner scanner = new Scanner(System.in);
		float cosseno = scanner.nextFloat();
		System.out.println("O seno de " +cosseno+ " é " + Math.cos(cosseno));
	}

	public static void Tangente() {
		System.out.println("Tangente é uma função trigonométrica calculada a partir da"
				+ "\ndivisão entre os catetos oposto e adjacente de um triângulo retângulo");
		System.out.println("Tangente é um valor que é dificil de calcular a mão. Digite um ângulo e eu direi sua tangente");
		Scanner scanner = new Scanner(System.in);
		float tangente = scanner.nextFloat();
		System.out.println("O seno de " +tangente+ " é " + Math.tan(tangente));
	}

	public static void Logaritmo() {
		System.out.println(Math.sqrt(2));
	}

	public static void MostrarMenu() {
		System.out.println("Boa Noite! O que você quer aprender hoje?\n" + "1) Exponenciação\n" + "2) Raíz Quadrada\n"
				+ "3) Seno\n" + "4) Cosseno \n" + "5) Tangente \n" + "6) Logaritmo na base 10 \n[99 para sair]");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		do {
			Menu.MostrarMenu();
			opcao = scanner.nextInt();
			switch (opcao) {
			case 1:
				Menu.Exponenciacao();
				break;
			case 2:
				Menu.RaizQuadrada();
				break;
			case 3:
				Menu.Seno();
				break;
			case 4:
				Menu.Cosseno();
				break;
			case 5:
				Menu.Tangente();
				break;
			case 6:
				Menu.Logaritmo();
				break;
			case 99:
				System.out.println("Adeus!");
				break;
			default:
				System.out.println("Número Inválido");
			}
		} while (opcao != 99);

	}
}
