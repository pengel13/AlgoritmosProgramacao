package exercicios1;

import java.util.Scanner;

public class JogoVelha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] Jogo = new String[3][3];
		int vez = 0;
		do {
			int c = 0;
			for (String[] linha : Jogo) {
				if (c != 0) {
					System.out.println("\n===============");
				}
				c++;
				int d = 0;
				for (String item : linha) {
					System.out.print(item != null ? " " + item + " " : "   ");
					d++;
					if (d != 3) {
						System.out.print(" | ");
					}
				}
			}
			boolean jogada = false;
			do {
				System.out.println("\nDigite a linha onde irá querer jogar: ");
				int coluna = scanner.nextInt();
				System.out.println("Digite a coluna onde irá querer jogar: ");
				int linha = scanner.nextInt();
				
				if (Jogo[coluna - 1][linha - 1] == null) {
					jogada = true;
					if (vez % 2 == 0) {
						Jogo[coluna - 1][linha - 1] = "X";
					} else {
						Jogo[coluna - 1][linha - 1] = "O";
					}
				}
				else {
					System.out.println("Jogada inválida");
				}
			} while (jogada == false);
			vez++;
			
			if ((Jogo[0][0] == Jogo[0][1] && Jogo[0][1] == Jogo[0][2]) ||
				(Jogo[0][0] == Jogo[1][1] && Jogo[1][1] == Jogo[2][2]) ||
				(Jogo[0][0] == Jogo[1][0] && Jogo[1][1] == Jogo[2][0])){
				String vencedor = Jogo[0][0];
				break;
			}
		} while (vez < 9);

	}

}
