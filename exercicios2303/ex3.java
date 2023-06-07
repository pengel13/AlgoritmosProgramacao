import java.util.Scanner;
public class ex3 {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe seu saldo");
    double saldo = scanner.nextFloat();
    double saldo_novo = saldo*1.01;
    System.out.println(saldo_novo);
    scanner.close();    

    }
}
