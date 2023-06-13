package aluno;

public class TestarArrayAluno {

	public static void main(String[] args) {
		Aluno[] turma = new Aluno[5];

		Aluno a1 = new Aluno("Pedro Engel", 10, 10);
		Aluno a2 = new Aluno("Arthur Kellerman", 5, 8);
		Aluno a3 = new Aluno("Lorenzo Kirst", 4, 7);
		Aluno a4 = new Aluno("Cassiano Morales", 3, 2);
		Aluno a5 = new Aluno("Ramiro Manoel", 8, 9);
		Aluno a6 = new Aluno("Arthur de Souza", 7, 9);

		turma[0] = a1;
		turma[1] = a2;
		turma[2] = a3;
		turma[3] = a4;
		turma[4] = a5;

		/*
		 * turma[0] = new Aluno("Pedro Engel", 10, 10); turma[1] = new
		 * Aluno("Arthur Kellerman", 5, 8); turma[2] = new Aluno("Lorenzo Kirst", 4, 7);
		 * turma[3] = new Aluno("Cassiano Morales", 3, 2); turma[4] = new
		 * Aluno("Ramiro Manoel", 8, 9);
		 */

		for (Aluno aluno : turma) {
			double media = aluno.calcularMedia();
			System.out.println(aluno.getNome() + " ------- " + media);
		}

		boolean presente = false;

		for (Aluno aluno : turma) {
			if (a6 == aluno) {
				presente = true;
				break;
			}
		}
		if (presente) {
			System.out.println("O aluno " + a6.getNome() + " está na lista. Sua média é " + a6.calcularMedia());
		} else {
			System.out.println("O aluno " + a6.getNome() + " não está na lista.");
		}
		
		
		int acima = 0;
		
		
		for (Aluno aluno : turma) {
			if (aluno.calcularMedia() < 6.0) {
				System.out.println("O aluno " + aluno.getNome() + " está abaixo da média");
			}
			else {
				acima++;
			}
		}
		System.out.println("Há " + acima + " alunos acima da média");

	}

}
