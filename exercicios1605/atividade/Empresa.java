package unisinos.atividade;

public class Empresa {
    private String nome = "desconhecido"; 
    private FuncionarioCaixa funcionario1 = null;
    private FuncionarioCaixa funcionario2 = null;

    public Empresa(String nome, FuncionarioCaixa funcionario1, FuncionarioCaixa funcionario2){
        this.setNome(nome);
        this.setFuncionario1(funcionario1);
        this.setFuncionario2(funcionario2);
    }
    public Empresa(String nome){
        this.setNome(nome);
    }
    public Empresa (){}

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setFuncionario1(FuncionarioCaixa funcionario){
        this.funcionario1 = funcionario;
    }
    public String getFuncionario1(){
        return this.funcionario1.imprimeInfo();
    }
    public void setFuncionario2(FuncionarioCaixa funcionario){
        this.funcionario2 = funcionario;
    }
    public String getFuncionario2(){
        return this.funcionario2.imprimeInfo();
    }

    public String imprimeInfo(){
        return this.getNome() + "(Funcionário 1= " + this.getFuncionario1() + ", Funcionário 2= " + this.getFuncionario2();
    }


}
