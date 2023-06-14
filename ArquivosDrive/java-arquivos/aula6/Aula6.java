import java.util.Scanner;
public class Aula6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maior;
		String Maior;
		System.out.println("Digite o primeiro valor: ");
		int n1 = scanner.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int n2 = scanner.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		int n3 = scanner.nextInt();
		if (n1>n2 && n1>n3) {
			maior = n1;
			Maior = "Primeiro valor";
		}
		else if (n2>n1 && n2>n3) {
			maior = n2;
			Maior = "Segundo valor";
		}
		else {
			maior = n3;
			Maior = "Terceiro valor";
		}
		System.out.println("O maior valor é " + maior);
	}
}
