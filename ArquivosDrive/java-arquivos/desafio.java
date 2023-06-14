import java.util.Scanner;
public class desafio {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tamanho da lista: ");
		int n = scanner.nextInt();
		int lista[] = new int[n];
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número inteiro:");
			int x = scanner.nextInt();
			lista[i] = x;
		}
		for (int i = 0; i< lista.length; i++) {
			System.out.printf("Posição %d: %d \n", i, lista[i]);
		}
		
	}
}
