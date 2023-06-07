import java.util.Scanner;
import java.math.*;
public class somadosquadrados {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Digite um valor:");
            n = scanner.nextInt();
        }while(n < 0);

        int total = 0;
        for (int c = 0; c-1 != n; c++){
            total += Math.pow(c, 2);
        }
        System.out.printf("A soma dos quadrados de %d é %d.", n, total);
        scanner.close();
    }
}
