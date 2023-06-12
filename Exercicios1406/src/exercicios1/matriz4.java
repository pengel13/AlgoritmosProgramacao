package exercicios1;

import java.util.Random;

public class matriz4 {
	public static void main(String[] args) {
		int[][] matriz = new int[4][4];

		Random gerador = new Random();
		int x = 0;
		for (int y = 0; y < 4; y++) {
			for (int z = 0; z < 4; z++) {
				x = gerador.nextInt(0, 50);
				matriz[y][z] = x;
			}
		}

		for (int[] linha : matriz) {
			System.out.println(" ");
			for (int termo : linha) {
				System.out.print(termo + " ");
			}
		}

		int maior = 0;
		int iMaior = 0;
		int jMaior = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 0 && j == 0) {
					maior = matriz[i][j];
					iMaior = i + 1;
					jMaior = j + 1;
				} else if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					iMaior = i + 1;
					jMaior = j + 1;
				}
			}
		}

		System.out.println("\nMaior = " + maior);
		System.out.println("Posições do maior número = (" + iMaior + ", " + jMaior + ")");
	}
}
