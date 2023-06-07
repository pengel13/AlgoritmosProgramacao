import java.util.Scanner;
public class codigoswitch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código de um produto(1-15) e eu direi sua classificação: ");
        int n = scanner.nextInt();
        switch(n){
            case 1:
                System.out.println("Alimento não-perecível");
                break;
            case 2:
                System.out.println("Alimento perecível");
                break;
            case 3:
                System.out.println("Alimento perecível");
                break;
            case 4:
                System.out.println("Alimento perecível");
                break;
            case 5:
                System.out.println("Vestuário");
                break;
            case 6:
                System.out.println("Vestuário");
                break;
            case 7:
                System.out.println("Higiene Pessoal");
                break;
            case 8:
                System.out.println("Limpeza e Utensílios domésticos");
                break;
            case 9:
                System.out.println("Limpeza e Utensílios domésticos");
                break;
            case 10:
                System.out.println("Limpeza e Utensílios domésticos");
                break;
            case 11:
                System.out.println("Limpeza e Utensílios domésticos");
                break;
            case 12:
                System.out.println("Limpeza e Utensílios domésticos");
                break;
            case 13:
                System.out.println("Limpeza e Utensílios domésticos");
                break;
            case 14:
                System.out.println("Limpeza e Utensílios domésticos");
                break;
            case 15:
                System.out.println("Limpeza e Utensílios domésticos");
                break;
            default:
                System.out.println("Código Inválido");
        }
        scanner.close();
    }
}
