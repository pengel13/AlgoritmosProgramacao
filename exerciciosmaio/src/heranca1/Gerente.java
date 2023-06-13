package heranca1;

public class Gerente extends Funcionario {
	private int senha;

	public Gerente() {
	}

	public Gerente(String nome, String cpf, float salario) {
		super(nome, cpf, salario);
	}

	public Gerente(String nome, String cpf, float salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int tentativa) {
		if (this.senha == tentativa) {
			System.out.println("Senha Correta");
			return true;
		}
		System.out.println("Acesso negado");
		return false;

	}

	@Override
	public String toString() {
		return "Gerente [senha=" + senha + ", toString()=" + super.toString() + "]";
	}

}
