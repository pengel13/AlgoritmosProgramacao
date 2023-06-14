package exercicios1;

import java.util.Scanner;

public class Agenda2 {
	public static void main(String[] args) {

		String[][][] eventos = new String[12][31][8];
		int opcao;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("MENU \n1) Registrar novo compromisso \n2) Ver agenda \n3) Sair");
			opcao = scanner.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o número do mês:");
				int mes = scanner.nextInt();
				System.out.println("Digite o número do dia:");
				int dia = scanner.nextInt();
				System.out.println("Digite o horario de comeco: (só pode comecar até as 8h da manhã)");
				int hora = scanner.nextInt();
				System.out.println("Digite o que é o compromisso:");
				scanner.nextLine();
				String compromisso = scanner.nextLine();
				eventos[mes - 1][dia - 1][hora -1] = compromisso;
				break;
			case 2:
				for (int a = 0; a < 12; a++) {
					for (int b = 0; b < 30; b++) {
						for (int c = 0; c < 8; c++) {
							if (eventos[a][b][c] == null) {
								continue;
							}
							System.out.println("O compromisso " + eventos[a][b][c] + " ocorre no dia " + (b + 1)
									+ " do mes " + (a + 1) + " e começa na hora " + (c + 1));

						}
					}
				}
				break;
			case 3:
				break;
			default:
				System.out.println("Número inválido! Tente novamente");
			}
		} while (opcao != 3);

	}
}
