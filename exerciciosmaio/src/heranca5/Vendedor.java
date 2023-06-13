package heranca5;

public class Vendedor extends Empregado {
	private float percentualComissao;

	public float getPercentualComissao() {
		return percentualComissao;
	}

	public Vendedor() {
		super();
	}

	public Vendedor(String nome, float salario) {
		super(nome, salario);
	}

	public Vendedor(String nome, float salario, float percentual) {
		super(nome, salario);
		this.setPercentualComissao(percentual);
	}

	public void setPercentualComissao(float percentualComissao) {
		this.percentualComissao = percentualComissao;
	}
	
	public float calcularSalario() {
		return this.getSalario() + percentualComissao* this.getSalario();
	}
	@Override
	public String toString() {
		return "Vendedor [percentualComissao=" + percentualComissao + ", salario sem comissao=" + salario
				+ ", salário com comissão:" + this.calcularSalario() + ", nome=" + this.getNome() + "]";
	}

}
