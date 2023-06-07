import java.util.Scanner;
public class subtracao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor a: ");
        int a = scanner.nextInt();
        
        System.out.println("Digite o valor b: ");
        int b = scanner.nextInt();
        String valor;

        if (a-b >= 0){
            valor = "positivo";
        }
        else{
            valor = "negativo";
        }
        System.out.printf("%d - %d resulta em um número %s", a, b, valor);
        scanner.close();
    }
}
