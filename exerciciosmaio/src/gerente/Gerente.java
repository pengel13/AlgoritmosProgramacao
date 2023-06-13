package gerente;

public class Gerente extends Funcionario {

	private String area;
	
	public Gerente(String nome, int dia, int mes, int ano, float salario) {
		super(nome, dia, mes, ano, salario);
	}
	
	public Gerente(String nome, int dia, int mes, int ano, float salario, String area) {
		super(nome, dia, mes, ano, salario);
		this.area = area;
	}

	public Gerente() {}
	
	public float calculaimposto() {
		return (0.05f * this.getSalario());
	}

	@Override
	public void imprimeDados() {
		System.out.println(this.toString());
	}

}
