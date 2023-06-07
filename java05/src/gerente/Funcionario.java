package gerente;

public class Funcionario extends Pessoa {

	private float salario;

	public Funcionario() {
	}

	public Funcionario(String nome, int dia, int mes, int ano, float salario) {
		this.setNome(nome);
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
		this.setSalario(salario);
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float calculaimposto() {
		return (0.03f * salario);
	}

	@Override
	public void imprimeDados() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", getNome()=" + getNome() + ", getDia()=" + getDia() + ", getMes()="
				+ getMes() + ", getAno()=" + getAno() + ", getClass()=" + getClass() + "]";
	}

}
