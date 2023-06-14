import java.util.Scanner;
public class intervalo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qualquer valor : ");
        int x = scanner.nextInt();

        System.out.println("Digite o valor inicial do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.println("Digite o valor final do intervalo: ");
        int fim = scanner.nextInt();
        String local;
        if (x>=inicio && x<=fim){
            local ="dentro";
        }
        else if (x<=inicio){
            local = "abaixo";
        }
        else{
            local = "acima";
        }
        System.out.printf("O número digitado está %s", local);
    }   
}
