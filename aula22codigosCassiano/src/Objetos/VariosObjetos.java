package Objetos;

import java.util.ArrayList;

public class VariosObjetos {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		ArrayList pessoas = new ArrayList();
		
		Pessoa pessoa = new Pessoa("EU", 22);
		Pessoa pessoa2 = new Pessoa("EU2", 23);
		Pessoa pessoa3 = new Pessoa("EU3", 24);
		
		pessoas.add(pessoa);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		Empacotamento.gravarArquivoBinario(pessoas, "pessoas.txt");
		@SuppressWarnings("rawtypes")
		ArrayList resultado = new ArrayList();
		resultado = Empacotamento.lerArquivoBinario("pessoas.txt");
		System.out.println(resultado.toString());
	}

}
