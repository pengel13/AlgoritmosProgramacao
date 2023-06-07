package Carro;
import java.io.Serializable;
public class Carro implements Serializable {
	private String cor = null;
	private int ano = 0;
	private String modelo = null;
	private String motor = null;
	private boolean tetoSolar = false;
	private boolean turbo = false;
	private static final long serialVersionUID = 5110549514946052395L;
	
	public Carro() {}
	
	public Carro(String cor, int ano,String modelo,
			String motor,boolean tetoSolar, boolean turbo) {
		setAno(ano);
		setCor(cor);
		setModelo(modelo);
		setMotor(motor);
		setTetoSolar(tetoSolar);
		setTurbo(turbo);
	}
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public boolean isTetoSolar() {
		return tetoSolar;
	}
	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}
	public boolean isTurbo() {
		return turbo;
	}
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", ano=" + ano + ", modelo=" + modelo + ", motor=" + motor + ", tetoSolar="
				+ tetoSolar + ", turbo=" + turbo + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	


}
