package exercicios1;

import java.util.Scanner;

public class Matriz3 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int pares = 0;
		int impares = 0;
		Scanner scanner = new Scanner(System.in);
		for (int x = 1; x < 4; x++) {
			for (int y = 1; y < 4; y++) {
				System.out.println("Digite o termo (" + x + ", " + y + ")");
				matriz[x - 1][y - 1] = scanner.nextInt();
				if (matriz[x - 1][y - 1] % 2 == 0) {
					pares++;
				} else {
					impares++;
				}
			}
		}
		for (int[] linha : matriz) {
			System.out.println(" ");
			for (int termo : linha) {
				System.out.print(termo + " ");
			}
		}
		
		System.out.println("\nNessa matriz, há "+ pares + "  números pares e " + impares + " números ímpares.");

	}

}
