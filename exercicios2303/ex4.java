import java.util.Scanner;
public class ex4 {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe a porcentagem de IPI a ser acrescido");
    double IPI = scanner.nextDouble();
    System.out.println("Informe o código da peça 1: ");
    double cod_peca1 = scanner.nextDouble();
    System.out.println("Informe o valor unitário da peça 1: ");
    double preco_peca1 = scanner.nextDouble();
    System.out.println("Informe quantidade de peças 1: ");
    int qtd_peca1 = scanner.nextInt();
    System.out.println("Informe o código da peça 2: ");
    double cod_peca2 = scanner.nextDouble();
    System.out.println("Informe o valor unitário da peça 2: ");
    double preco_peca2 = scanner.nextDouble();
    System.out.println("Informe quantidade de peças 2: ");
    int qtd_peca2 = scanner.nextInt();
    double valor_total = (preco_peca1*qtd_peca1 +  preco_peca2*qtd_peca2)*(IPI/100+1);
    System.out.println("Códigos de peças=" + cod_peca1 + ", " + cod_peca2);
    System.out.println("O valor total a ser pago é " +valor_total);
    scanner.close();
    }
}
 