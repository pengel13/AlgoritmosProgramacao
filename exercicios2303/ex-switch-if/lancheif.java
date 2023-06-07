import java.util.Scanner;
public class lancheif {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("CARDÁPIO CASA DE LANCHES:");
    System.out.println("100 - Cachorro Quente - R$1,70");
    System.out.println("101 - Bauru Simples - R$2,30");
    System.out.println("102 - Bauru com Ovo - R$2,60");
    System.out.println("103 - Hamburguer - R$2,50");
    System.out.println("104 - Cheeseburguer - R$2,60");
    System.out.println("105 - Refrigerante - R$1,00");
    System.out.println("----------------------------");
    System.out.println("Digite o código do produto a ser escolhido:");
    int codigo = scanner.nextInt();
    System.out.println("Quantidade de produtos:");
    int qtd = scanner.nextInt();
    Double total = 0.0;
    if (codigo == 100){
        total = 1.7 * qtd;
    }else if(codigo == 101){
        total = 2.3 * qtd;
    }else if(codigo == 102){
        total = 2.6 * qtd;
    }else if(codigo == 103){
        total = 2.5 * qtd;
    }else if(codigo == 104){
        total = 2.6 * qtd;
    }else if(codigo == 105){
        total = 1.0 * qtd;
    }else{
        System.out.println("Código Inválido");
    }
    System.out.printf("O total do pedido foi de R$%.2f", total);
    scanner.close();
    }
}