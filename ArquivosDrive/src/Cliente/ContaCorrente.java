package Cliente;

public class ContaCorrente {
	
	private float Saldo;
	private String cliente;

	public ContaCorrente() {
	}

	public ContaCorrente(Cliente cliente, float saldo) {
		this.setCliente(cliente);;
		this.setSaldo(saldo);
	}
	
	public ContaCorrente(Cliente cliente) {
		this.setSaldo(cliente.getRenda());
		this.setCliente(cliente);
	}
	
	public void depositar(float valor) {
		this.Saldo += valor;
	}

	public void sacar(float valor) {
		if ((this.Saldo - valor) < 0) {
			System.out.println("Não foi possível sacar esse valor.");
		} else {
			this.Saldo -= valor;
			System.out.println("Valor sacado!");
		}
	}

	public float getSaldo() {
		return Saldo;
	}

	public void setSaldo(float saldo) {
		if (saldo <= 0) {
			this.Saldo = 0;
		} else {
			this.Saldo = saldo;
		}
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente.getNome();
	}

	@Override
	public String toString() {
		return "ContaCorrente [Saldo=" + Saldo + ", cliente=" + cliente + "]";
	}

}
