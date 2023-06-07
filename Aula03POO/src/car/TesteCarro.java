package car;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro fit = new Carro();
		Sedan civic = new Sedan();
		
		fit.marca = "Honda";
		fit.ano = 2014;
		fit.preco = 55000;
		
		civic.marca = "Honda";
		civic.ano = 2014;
		civic.preco = 75000;
		civic.portaMalas = 450;
		
		System.out.println(fit.marca);
		
	}

}
