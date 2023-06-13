package gerente;

import java.util.ArrayList;

public class CadastroPessoa {
	private ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private int qtdatual = listaPessoas.size();
	public CadastroPessoa() {}
	public void CadastraPessoa(Pessoa pessoa) {
		listaPessoas.add(pessoa);
		qtdatual +=1;
		System.out.println("Número de pessoas = " + qtdatual);
	}
	public void ImprimeCadastro(Pessoa pessoa) {
		System.out.println(pessoa.getNome() + " cadastrado");
		
		System.out.println("Número de pessoas = " + qtdatual);
	}
	@Override
	public String toString() {
		return "CadastroPessoa [listaPessoas=" + listaPessoas + ", qtdatual=" + qtdatual + "]";
	}
	
}
