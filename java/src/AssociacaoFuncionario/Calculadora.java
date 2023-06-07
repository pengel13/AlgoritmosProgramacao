package AssociacaoFuncionario;
import java.math.*;

public class Calculadora {
	private String cor;
    private float memoria = 0;
    
    public Calculadora(){}

    public Calculadora(String cor){
        this.setCor(cor);
    }

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getMemoria() {
		return memoria;
	}

	public void setMemoria(float memoria) {
		this.memoria = memoria;
	}
    
	public double soma(double x, double y){
        return x+y;
    }
    public double subtracao(double x, double y){
        return x-y;
    }
    public double multiplica(double x, double y){
        return x*y;
    }
    public double divide(double x, double y){
        return x/y;
    }
    public double elevaAoQuadrado(int x){
        return Math.pow(x, 2);
    }
    public double elevaAoCubo(int x){
        return Math.pow(x, 3);
    }
    public String imprimeInfo(){
        return "Calculadora (cor =  " + this.getCor() +" memoria = "+ this.getMemoria() +")";
    }

    
    
}



