package unisinos.atividade1705;

public class Pessoa {
    private String nome;
    private int idade;
    private String CPF;
    
    public Pessoa(String nome, int idade, String cpf){
        this.setNome(nome);
        this.setIdade(idade);
        this.setCPF(cpf);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public String getCPF(){
        return this.CPF;
    }

    @Override
    public String toString(){
        return f("Pessoa(nome = %s, idade = %f, cpf = %s)", this.getNome, this.getIdade, this.getCPF);
    }
    


}

