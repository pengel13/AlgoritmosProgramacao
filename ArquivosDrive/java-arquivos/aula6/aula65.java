import java.util.Scanner;
public class aula65 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a sua nota: ");
		double nota = scanner.nextDouble();
		char resultado;
		if (0 <= nota && nota <= 10){
			if (nota>= 8.5) {
				resultado = 'A';
			}
			else if(nota>=7) {
				resultado = 'B';
			}
			else if(nota>=5) {
				resultado = 'C';
			}
			else if(nota>=3) {
				resultado = 'D';
			}
			else {
				resultado = 'E';
			}
			System.out.println("Seu conceito foi " + resultado);
		}
		else {
			System.out.println("Nota inválida");
		}
		
		
	}
}
