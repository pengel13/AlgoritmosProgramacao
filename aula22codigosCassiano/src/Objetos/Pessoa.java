package Objetos;

import java.io.Serializable;

public class Pessoa implements Serializable{
	 
	       private static final long serialVersionUID = 5110549514946052395L;
	       private String nome;
	       private int idade;
	       
	       public Pessoa() {}
	       public Pessoa(String nome, int idade) {
	    	   setNome(nome);
	    	   setIdade(idade);
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
		@Override
		public String toString() {
			return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
		}
	       
	       
}
