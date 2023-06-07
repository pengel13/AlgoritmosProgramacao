package Objetos;

public class TestaObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa("EU", 22);
		SalvarObjeto.salvar(pessoa, "pessoa.sav");
		
		System.out.println((Pessoa) RestaurarObjeto.restaurar("pessoa.sav"));

	}

}
