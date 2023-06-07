import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int n = scanner.nextInt();
        System.out.println("O número que você digitou foi " + n + ",  seu antecessor é " + (n-1) + " e seu sucessor é " + (n+1));
        scanner.close();
    }
}
