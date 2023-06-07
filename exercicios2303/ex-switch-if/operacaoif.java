import java.util.Scanner;
public class operacaoif {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        Double n1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        Double n2 = scanner.nextDouble();

        System.out.println("DIGITE O NÚMERO DA OPERAÇÃO A SER FEITA COM OS DOIS NÚMEROS:");
        System.out.println("1: Média");
        System.out.println("2: Diferença");
        System.out.println("3: Produto");
        System.out.println("4: Divisão");
        int opcao = scanner.nextInt();
        Double total;
        if (opcao == 1){
            total = (n1 + n2) / 2;
            System.out.println("A média é " + total);
        }else if(opcao == 2){
            total = n1 - n2;
            System.out.println("A diferença é " + total);
        }else if(opcao == 3){
            total = n1 * n2;
            System.out.printf("O produto é %.3f ", total);
        }else if(opcao == 4){
            total = n1 / n2;
            System.out.printf("A divisão é %.3f ", total);
        }else{
            System.out.println("Opção Inválida");
        }
        scanner.close();
    }
}

