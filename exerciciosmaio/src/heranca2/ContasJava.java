package heranca2;

public class ContasJava {
	public static void main(String[] args) {
		ContaEspecial c1 = new ContaEspecial("Pedro Engel", 181818, 200.25f);
		c1.setLimite(100);
		c1.sacar(150);
		c1.depositar(50);
		System.out.println("Saldo de " + c1.getCliente() + ": R$" + c1.getSaldo());
		System.out.println(c1.toString());

		ContaPoupanca c2 = new ContaPoupanca("Cassiano", 1903, 10000);
		c2.setDia_rendimento(21);
		c2.sacar(3000);
		c2.depositar(10000);
		c2.calcularNovoSaldo(0.06f);
		System.out.println(c2.toString());
		
	}
}
