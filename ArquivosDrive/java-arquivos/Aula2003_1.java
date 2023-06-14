package aula2003;
import java.util.Scanner;
public class Aula2003_1 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Frente");
		//System.out.println(sb);
		
		
		// classe ENUM
		/*enum LEVEL { EASY, MEDIUM, HARD, ULTIMATE } 
		LEVEL myVar = LEVEL.MEDIUM;*/
		
		
		/*StringBuilder ast = new StringBuilder();

		for (int i = 1; i <=10; i++) {
			ast.append("*");
			System.out.println(ast.toString());
		}*/
		/*for (int i = 1; i<=100; i +=2) {
			System.out.println(i);*/
		Scanner scanner = new Scanner(System.in);
		/*for (int i = 1; i >= 0; i++) {
			System.out.println("Opcao 1");
			System.out.println("Opcao 2");
			System.out.println("Opcao 3");
			System.out.println("Opcao 4");
			System.out.println("Opcao 5");
			System.out.println("Escolha uma das opcoes acima ou digite 99 para sair");
			i = scanner.nextInt();
			if (i == 99){
				break;
			
		}
		System.out.println("Fim do FOR!");*/
		/*int numero = 0;
		while (numero != 99) {
			System.out.println("MENU WHILE");
			for(int i = 0; i <=4; i++)
				System.out.println("Opcao " + (i+1));
			System.out.println("Digite 99 para sair");
			numero = scanner.nextInt();
			if (numero >=1 && numero <=5 || numero == 99){
				System.out.printf("Opcao %d escolhida\n", numero);
			}
			else {
				System.out.println("Opcao inválida");
			}
		}	
		System.out.println("FIM DO WHILE");*/
		int x = -1;
		int n = 0;
		do {
			if (++x % 2 == 0) {
				System.out.println(x);
				n++;
			}
		} while (n<50);
		System.out.println("Fim do DO WHILE");
	}
}	