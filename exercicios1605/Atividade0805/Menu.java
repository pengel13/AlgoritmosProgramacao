import java.util.Scanner;
import java.math.*;
public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("Boa Noite! O que você quer aprender hoje?\n" + "1) Exponenciação\n" + "2) Raíz Quadrada\n"
				+ "3) Seno\n" + "4) Cosseno \n" + "5) Tangente \n" + "6) Logaritmo na base 10 \n[99 para sair]");
			opcao = scanner.nextInt();
			switch (opcao) {
			case 1:
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
				break;
			case 2:
				System.out.println("A raiz quadrada é uma operação básica e importante da Matemática. "
				+ "\nSe trata da operação inversa da exponenciacao. "
				+ "\nAssim, calcular a raiz quadrada de um número n é descobrir qual número elevado ao quadrado resulta em n. "
				+ "\nPor exemplo, a raiz quadrada de 9 é igual a 3, pois, 3² é 9.");
				System.out.println("Vamos praticar!");
				int raiz = 0;
				do {
					System.out.println("Digite a raiz de 25:");
					raiz = scanner.nextInt();
					if (raiz == 5) {
						System.out.println("Parabéns, você aprendeu raiz quadrada!");
						break;
					}
					System.out.println("Resposta errada! Pense em algum número que multiplicado por ele mesmo é 25");
					} while (raiz != 5);
				break;
			case 3:
				System.out.println("O Seno de qualquer ângulo é o valor que encontramos ao dividir o seu cateto oposto pela hipotenusa.");
				System.out.println("Seno é um valor que é dificil de calcular a mão. Digite um ângulo e eu direi seu seno");
				float seno = scanner.nextFloat();
				System.out.println("O seno de " +seno+ " é " + Math.sin(Math.toRadians(seno)));
				break;
			case 4:
				System.out.println("O cosseno de um ângulo é a razão entre a medida do cateto adjacente e a medida da hipotenusa");
				System.out.println("Cosseno é um valor que é dificil de calcular a mão. Digite um ângulo e eu direi sua tangente");
				float cosseno = scanner.nextFloat();
				System.out.println("O seno de " +cosseno+ " é " + Math.cos(Math.toRadians((cosseno))));
				break;
			case 5:
				System.out.println("Tangente é uma função trigonométrica calculada a partir da"
				+ "\ndivisão entre os catetos oposto e adjacente de um triângulo retângulo");
				System.out.println("Tangente é um valor que é dificil de calcular a mão. Digite um ângulo e eu direi sua tangente");
				float tangente = scanner.nextFloat();
				System.out.println("O seno de " +tangente+ " é " + Math.tan(Math.toRadians(tangente)));
				break;
			case 6:
				System.out.println("Logaritmo na base 10 é quantas vez o 10 precisa ser elevado até chegar naquele valor." +
				"\nPor Exemplo: log de 1000 na base 10 é 3. Pois 10³ é 1000.");
				System.out.println("Agora digite o log de 100 na base 10");
				int log =0;
				do {
					log = scanner.nextInt();
					if (log == 2) {
						System.out.println("Parabéns, você aprendeu logaritmo na base 10");
						break;
					}
					System.out.println("Resposta errada! Pense em um número que quando 10 for elevado a ele chegue em 100");
					} while (log != 2);
				break;
			case 99:
				System.out.println("Adeus!");
				break;
			default:
				System.out.println("Número Inválido");
			}
		} while (opcao != 99);
        scanner.close();
	}
}