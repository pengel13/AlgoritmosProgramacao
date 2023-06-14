package Pessoa;

public class Pessoa {
	public String nome;
	public int idade;
	
	public Pessoa() {}  // permite que seja criado um objeto sem nome e idade
	
	public Pessoa(String nome, int idade) { /* __init__ do python */
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void falar() {
		System.out.println("Método falar que não precisa de um parametro");
	}
	
	public String falar(String msg) {
		return msg;
	}

	@Override
	public String toString() {
		return "Pessoa (nome=" + nome + ", idade=" + idade + ")";
	}
	
}	
