package Curso;

public class Aluno {
	private String nome;
	private String cpf;
	private int idade;
	private String curso;
	
	public Aluno() {}
	
	public Aluno(String nome, String cpf, int idade) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setIdade(idade);
	}
	
	public Aluno(String nome, String cpf, int idade, Curso curso) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setIdade(idade);
		this.setCurso(curso);
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", curso=" + curso + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso.getNome();
	}
}
