package heranca2;

public class ContaBancaria {
	private String cliente;
	private int num_Conta;
	private float saldo;

	public ContaBancaria() {
	}

	public ContaBancaria(String cliente, int num_Conta, float saldo) {
		this.cliente = cliente;
		this.num_Conta = num_Conta;
		this.saldo = saldo;
	}

	public void sacar(float valor) {
		if (this.saldo < valor) {
			System.out.println("Não foi possível sacar esse valor, pois é maior que o saldo atual.");
		} else {
			this.saldo -= valor;
			System.out.printf("Valor sacado! Seu saldo agora é de R$%.2f\n", this.saldo);
		}
	}

	public void depositar(float valor) {
		this.saldo += valor;
		System.out.printf("Valor depositado! Agora seu saldo é de R$%.2f\n", this.saldo);
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNum_Conta() {
		return num_Conta;
	}

	public void setNum_Conta(int num_Conta) {
		this.num_Conta = num_Conta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [cliente=" + cliente + ", num_Conta=" + num_Conta + ", saldo=" + saldo + "]";
	}

}
