import java.util.Scanner;
public class ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua idade em anos: ");
		int anos = scanner.nextInt();
		System.out.println("Digite sua idade em meses: ");
		int meses = scanner.nextInt();
		System.out.println("Digite sua idade em dias: ");
		int dias = scanner.nextInt();
		int total = anos * 365 + meses * 30 + dias;
		System.out.println("Total de "+total + " dias.");
		scanner.close();
	}
}
