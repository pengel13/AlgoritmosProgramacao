import java.util.Scanner;
// import java.text.DecimalFormat;
// import java.math.*;
public class Principal {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

/**		System.out.println("OI" );
		System.out.print("Meu nome � Pedro" );
		System.out.println(" e tenho 18anos.");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual seu nome?");
		String nome = scanner.next();
		System.out.print("Qual sua idade?");
		String idade1 = scanner.next();
		System.out.println("Seja bem vindo " + nome);
		System.out.println("Voc� tem " + idade1 + " anos");
		
		int idade = 18, numeroA = 8, numeroB = 9;
		//System.out.println("Idade comeca como " + idade);
		idade = 19;
		//System.out.println("Idade termina como " + idade);
		final double numeroPI = 3.14159265359;
		System.out.println(numeroPI);
		double soma = 0, produto = 0, divisao = 0;
		soma = idade + numeroPI;
		System.out.println(soma);
		System.out.println(numeroA + numeroB);
		produto = numeroA * numeroB;
		System.out.println("Produto de " + numeroA + '+' + numeroB + '=' + produto);
		divisao = (double) numeroB / numeroA;
		System.out.println(divisao);

		final double numeroPI = 3.14159265359;
		DecimalFormat df = new DecimalFormat("###.000");
		System.out.println(df.format(numeroPI));
		System.out.printf("Número PI: %.3f", numeroPI); 
		System.out.printf("\nA subtração de 5-4 é %d", (5-4));
*/	 
		Scanner scanner = new Scanner(System.in);
		double base = 5;
		double potencia = 5;
		System.out.println("Potenciaçao de " + base + " na potencia " + potencia + " = " + (Math.pow(base, potencia)));
		System.out.println("Raiz quadrada de 25: "+ (Math.sqrt(25)));
		System.out.printf("Seno de 30: %.3f", (Math.sin(30)));
		System.out.printf("\nCosseno de 30: %.3f", (Math.cos(30)));
		System.out.printf("\nSeno de 30: %.3f", (Math.tan(30)));
		scanner.close();
		System.out.printf("\nA subtração de 5-4 é %d", (5-4));
	}
}
