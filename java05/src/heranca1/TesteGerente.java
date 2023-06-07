package heranca1;

import java.util.Scanner;

public class TesteGerente {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do gerente");
		String nome = scanner.next();
		System.out.println("Digite a salário do gerente");
		float salario = scanner.nextInt();
		System.out.println("Digite o cpf do gerente");
		String cpf = scanner.next();
		System.out.println("Digite a senha do gerente");
		int senha = scanner.nextInt();
		Gerente g1 = new Gerente(nome, cpf, salario, senha);

		System.out.println("Digite o nome do funcionário");
		String nomefunc = scanner.next();
		System.out.println("Digite a salário do gerente");
		float salariofunc = scanner.nextInt();
		System.out.println("Digite o cpf do gerente");
		String cpffunc = scanner.next();

		System.out.println("Para confirmar a adição desse funcionário, digite a senha do gerente:");
		int testesenha = scanner.nextInt();
		if (g1.autentica(testesenha)) {
			Funcionario f1 = new Funcionario(nomefunc, cpffunc, salariofunc);
			System.out.println("FUNCIONÁRIO ADICIONADO COM SUCESSO");
			System.out.println(f1.toString());
		} else {
			System.out.println("NÃO FOI POSSÍVEL ADICIONAR FUNCIONÁRIO");
		}
		
		scanner.close();
	}

}
