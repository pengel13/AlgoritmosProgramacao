package gerente;

public class TestaCadastro {

	public static void main(String[] args) {
		CadastroPessoa c1 = new CadastroPessoa();
		Gerente g1 = new Gerente("Pedro", 13, 1, 2005, 15000, "Marketing" );
		Cliente c = new Cliente("Keka", 4, 2, 2005, 15555);
		Funcionario f1 = new Funcionario("Cassiano", 17, 4, 1990, 2500);
		c1.CadastraPessoa(f1);
		c1.CadastraPessoa(g1);
		c1.CadastraPessoa(c);
		System.out.println(c1.toString());
	}

}
