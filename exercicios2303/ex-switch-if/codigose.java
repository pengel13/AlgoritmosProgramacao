import java.util.Scanner;
public class codigose {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código de um produto(1-15) e eu direi sua classificação: ");
        int n = scanner.nextInt();
        if (n == 1){
            System.out.println("Alimento não-perecível");
        }else if(2 <= n && n <= 4){
            System.out.println("Alimento perecível");
        }else if(5 == n || n == 6){
            System.out.println("Vestuário");
        }else if(n == 7){
            System.out.println("Higiene Pessoal");
        }else if(8 <= n && n <= 15){
            System.out.println("Limpeza e Utensílios Domésticos");
        }else{
            System.out.println("Código Inválido");
        }
        scanner.close();
    }
}
