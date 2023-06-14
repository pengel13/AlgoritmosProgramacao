import java.util.Scanner;
public class Aula62 {
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
		
		if (n1>n2) {
			if(n1>n3) {
				maior = n1;}
			else {
				maior = n3;}
		}
		else {
			maior = n2;
			}
		System.out.println("O maior valor é " + maior);
	}
}
