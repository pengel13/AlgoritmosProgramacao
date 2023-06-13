package heranca2;

public class ContaPoupanca extends ContaBancaria {
	@Override
	public String toString() {
		return "ContaPoupanca [dia_rendimento=" + dia_rendimento + ", Cliente=" + getCliente() + ", Numéro Conta="
				+ getNum_Conta() + ", Saldo()=" + getSaldo() + "]";
	}

	private int dia_rendimento;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String cliente, int num_Conta, float saldo) {
		super(cliente, num_Conta, saldo);
	}

	public ContaPoupanca(String cliente, int num_Conta, float saldo, int dia_rendimento) {
		super(cliente, num_Conta, saldo);
		this.setDia_rendimento(dia_rendimento);
	}

	public int getDia_rendimento() {
		return dia_rendimento;
	}

	public void setDia_rendimento(int dia_rendimento) {
		this.dia_rendimento = dia_rendimento;
	}

	public void calcularNovoSaldo(float taxa) {
		taxa = this.getSaldo() * taxa;
		this.setSaldo(this.getSaldo() + taxa);
		System.out.printf("Seu novo saldo é R$%.2f \n", this.getSaldo());
	}

}
