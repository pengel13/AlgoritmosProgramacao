package Cliente;

public class TestarCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente("Keka", "Rua Suica, 620", 999);
		Cliente c3 = new Cliente("Lorenzo", "Rua João Correia", 8787.00f);
		c1.setNome("Engel");
		c1.setEndereco("Rua América, 669");
		c1.setRenda(2000.00f);
		
		//System.out.println(c1.toString());
		//System.out.println(c2.toString());
		//System.out.println(c3.toString());
		ContaCorrente conta1 = new ContaCorrente(c1, c1.getRenda());
		conta1.sacar(50);
		System.out.println(conta1.toString());
	}

}
