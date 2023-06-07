import java.util.Scanner;
public class divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numerador: ");
        int a = scanner.nextInt();

        System.out.println("Denominador: ");
        int b = scanner.nextInt();
        
        if (a % b == 0){
            System.out.printf("%d é perfeitamente divisível por %d", a, b);
        }
        else{
            System.out.printf("%d não é perfeitamente divisível por %d", a, b);
        }
        scanner.close();
    }
}
