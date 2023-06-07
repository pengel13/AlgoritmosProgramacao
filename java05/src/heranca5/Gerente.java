package heranca5;

public class Gerente extends Empregado {
	private String departamento;

	@Override
	public String toString() {
		return "Gerente [departamento=" + departamento + ", salario=" + salario + ", nome=" + this.getNome() + "]";
	}

	public Gerente() {
		super();

	}

	public Gerente(String nome, float salario) {
		super(nome, salario);

	}

	public Gerente(String nome, float salario, String departamento) {
		super(nome, salario);
		this.setDepartamento(departamento);

	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
