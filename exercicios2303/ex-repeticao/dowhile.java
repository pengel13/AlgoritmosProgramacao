import java.util.Scanner;
public class dowhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Digite um valor:");
            n = scanner.nextInt();
        }while(n < 0);
        int total = 1;
        for (int c = 1; c-1 != n; c++){
            total = total * c;
        }
        System.out.printf("O valor do fatorial de %d é %d", n, total);
        scanner.close();



    }
}
