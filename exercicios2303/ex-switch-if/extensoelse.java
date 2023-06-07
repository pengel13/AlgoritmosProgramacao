import java.util.Scanner;
public class extensoelse{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10: ");
        int n = scanner.nextInt();
        if (n == 1){
            System.out.println("Um");
        }
        else if (n == 2){
            System.out.println("Dois");
        }
        else if (n == 3){
            System.out.println("Três");
        }
        else if (n == 4){
            System.out.println("Quatro");
        }
        else if (n == 5){
            System.out.println("Cinco");
        }
        else if (n == 6){
            System.out.println("Seis");
        }
        else if (n == 7){
            System.out.println("Sete");
        }
        else if (n == 8){
            System.out.println("Oito");
        }
        else if (n == 9) {
            System.out.println("Nove");
        }
        else if (n == 10) {
            System.out.println("Dez");
        }
        else{
            System.out.println("Número Inválido");
        }
        scanner.close();
    }
}