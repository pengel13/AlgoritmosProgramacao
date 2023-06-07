package unisinos.atividade;

public class FuncionarioCaixa{
    private String nome = "desconhecido";
    private String endereco = "desconhecido";
    private String sexo = "desconhecido";
    private calculadora calculator = new calculadora("desconhecido");

    public FuncionarioCaixa(){}
    
    public FuncionarioCaixa(String nome, String endereco, String sexo, calculadora calculadora){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setSexo(sexo);
        this.setCalculadora(calculadora);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return this.sexo;
    }

    public void setCalculadora(calculadora calculadora){
        this.calculator = calculadora;
    }

    public String getCalculadora(){
        return this.calculator.imprimeInfo();
    }

    public double soma(double x, double y){
        return this.calculator.soma(x, y);
    }

    public double subtracao(double x, double y){
        return this.calculator.subtracao(x, y);
    }

    public double multiplica(double x, double y){
        return this.calculator.multiplica(x, y);
    }

    public double divide(double x, double y){
        return this.calculator.divide(x, y);
    }

    public double elevaAoQuadrado(int x){
        return this.calculator.elevaAoQuadrado(x);
    }

    public double elevaAoCubo(int x){
        return this.calculator.elevaAoCubo(x);
    }

    public String imprimeInfo(){
        return "Funcionario Caixa ( nome =" + this.getNome() + ", endereco = " + this.getEndereco() + ", sexo =" + this.getSexo() + ",calculadora = " +this.calculator.imprimeInfo() ;
    }
}