package exercicios1;

import java.util.Random;

public class Matriz10 {
	public static void main(String[] args) {
		int[][] matriz = new int[10][10];

		Random gerador = new Random();
		int x = 0;
		for (int y = 0; y < 10; y++) {
			for (int z = 0; z < 10; z++) {
				x = gerador.nextInt(0, 10);
				matriz[y][z] = x;
			}
		}

		for (int[] linha : matriz) {
			System.out.println(" ");
			for (int termo : linha) {
				System.out.print(termo + " ");
			}
		}
		int maior5lin = 0;
		int menor5lin = 10;
		for (int termo : matriz[4]) {
			if (termo > maior5lin) {
				maior5lin = termo;
			}
			if (termo < menor5lin) {
				menor5lin = termo;
			}
		}
		int maior7col = 0;
		int menor7col = 10;
		for (int a = 0; a < 10; a++) {
			int termo = matriz[a][6];
			if (termo > maior7col) {
				maior7col = termo;
			}
			if (termo < menor7col) {
				menor7col = termo;
			}

		}

		System.out.println("\nMaior da 5 linha: " + maior5lin);
		System.out.println("Menor da 5 linha: " + menor5lin);
		System.out.println("Maior da 7 coluna: " + maior7col);
		System.out.println("Menor da 7 coluna: " + menor7col);

	}
}
