import java.util.Scanner;
public class par_impar {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        String par_impar;
        if ( n%2 == 0){
            par_impar = "par";
        }
        else{
            par_impar = "ímpar";
        }
        System.out.printf("O número %d é %s", n, par_impar);
        scanner.close();
    }
}