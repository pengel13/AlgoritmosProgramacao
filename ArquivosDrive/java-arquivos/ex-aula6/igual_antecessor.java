import java.util.Scanner;
public class igual_antecessor {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor para a: ");
        int a = scanner.nextInt();

        System.out.println("Digite um valor para b: ");
        int b = scanner.nextInt();
        String lugar;
        if (a>b){
            lugar = "sucessor";
        }
        else if(b>a){
            lugar = "antecessor";
        }
        else{
            lugar = "igual";
        }
        System.out.printf("O valor 'a' é %s do valor 'b'", lugar);
        scanner.close();
    }
}
