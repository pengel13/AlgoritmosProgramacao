package Carro;



public class GravaCarro {

	public static void main(String[] args) {
		 Carro car1 = new Carro("Azul", 2023, "Ferrari",
					"4.2", true, true); 
		
		 Utils.gravaArquivo(car1, "carro.txt");
		 Utils.lerArquivo("carro.txt");
		 
		 Carro car2 = new Carro("Avermelho", 2024, "Ferrari",
					"4.2", true, true); 
		 
		 Utils.gravaArquivo(car2, "carro.txt");
		 Utils.lerArquivo("carro.txt");

	}

}
