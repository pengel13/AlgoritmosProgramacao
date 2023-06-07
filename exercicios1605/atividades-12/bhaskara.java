import java.util.*;
import java.util.Scanner;

public class bhaskara{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        Double a = scanner.nextDouble();
        System.out.println("Digite o valo de b: ");
        Double b = scanner.nextDouble();
        System.out.println("Digite o valo de c: ");
        Double c = scanner.nextDouble();
        System.out.printf("A equação é %.1fx² + %.1fx + %.1f = 0\n", a, b, c);
        Double delta = Math.pow(b, 2.0) - 4 * a * c;

        Double raiz1 = (-b + Math.sqrt(delta)) / (2*a);
        Double raiz2 = (-b - Math.sqrt(delta)) / (2*a);
        System.out.printf("As raízes são %.2f e %.2f", raiz1, raiz2);
    }
}