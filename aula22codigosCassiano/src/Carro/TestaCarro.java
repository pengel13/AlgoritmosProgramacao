package Carro;

import Objetos.RestaurarObjeto;
import Objetos.SalvarObjeto;

public class TestaCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro car1 = new Carro("Azul", 2023, "Ferrari",
				"4.2", true, true);
		
		
		SalvarObjeto.salvar(car1, "teste.txt");
		
		
		Carro car = new Carro();
		car = (Carro) RestaurarObjeto.restaurar("teste.txt");
		
		System.out.println(car.toString());	
		

	}

}
