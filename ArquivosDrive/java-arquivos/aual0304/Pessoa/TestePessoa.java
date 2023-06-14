package Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("Pedro", 1999999);
		/*p1.setNome("Pedro");
		p1.setIdade(18);
		p1.setNome("Cassiano");*/
		System.out.println(p1.getNome());
		System.out.println(p1.getIdade());
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Thaciano");
		p2.setIdade(18);
		System.out.println(p1.getNome());
		System.out.println(p1.getIdade());
		System.out.println(p1.toString());
		System.out.println(p2.falar("Mensagem falada pelo método falar"));
		p2.falar();
	}

}
