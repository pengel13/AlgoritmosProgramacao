package heranca2;

public class ContaEspecial extends ContaBancaria {

	@Override
	public String toString() {
		return "ContaPoupanca [limite=" + limite + ", Cliente=" + getCliente() + ", Numéro Conta=" + getNum_Conta()
				+ ", Saldo=" + getSaldo() + "]";
	}

	private float limite;

	public ContaEspecial() {
	}

	public ContaEspecial(String cliente, int num_Conta, float saldo) {
		super(cliente, num_Conta, saldo);
	}

	public ContaEspecial(String cliente, int num_Conta, float saldo, float limite) {
		super(cliente, num_Conta, saldo);
		this.setLimite(limite);
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(float valor) {
		if (this.getSaldo() - valor >= -limite) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.printf("Valor sacado! Seu saldo agora é R$%.2f\n", this.getSaldo());
		} else {
			System.out.println("Não foi possível sacar esse valor");
		}

	}

}
