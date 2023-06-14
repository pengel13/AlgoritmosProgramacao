package Curso;

public class TesteAluno {

	public static void main(String[] args) {
		Curso computacao = new Curso(12, "Ciência da Computação");
		Aluno Pedro = new Aluno("Pedro Engel", "05426366039", 18, computacao);
//		System.out.println(Pedro.toString());
		System.out.println(Pedro.getNome());
		System.out.println(Pedro.getCpf());
		System.out.println(Pedro.getIdade());
		System.out.println(Pedro.getCurso());
		System.out.println(computacao.getCodigo());
	}

}
