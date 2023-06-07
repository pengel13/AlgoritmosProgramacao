import java.util.Scanner;
public class extensosc{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10: ");
        int n = scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Sete");
            case 8:
                System.out.println("Oito");
                break;
            case 9:
                System.out.println("Nove");
                break;
            case 10:
                System.out.println("Dez");
                break;
            default:
                System.out.println("Número Inválido");
        }
        scanner.close();
    }
}