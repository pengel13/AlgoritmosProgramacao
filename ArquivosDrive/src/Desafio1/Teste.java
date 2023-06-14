package Desafio1;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Roupa roupa = new Roupa();
		roupa.setCouro(false);
		System.out.println(roupa.isCouro() ? "A roupa é de couro" : "" );
		
			
		}

}
