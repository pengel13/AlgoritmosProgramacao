package heranca5;

public class TesteFuncionaro {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor("Pedro", 1500, 0.10f);
		Gerente g1 = new Gerente("Carlos", 10000, "Letras");
		System.out.println(v1.toString());
		System.out.println(g1.toString());
	}

}
