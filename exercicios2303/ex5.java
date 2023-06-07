import java.util.Scanner;;
public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor do salário mínimo? ");
        double sal_minimo = scanner.nextDouble();
        System.out.println("Digite seu salário: ");
        double salario = scanner.nextDouble();
        double qtd_sal_minimo = salario / sal_minimo;
        System.out.println("Você ganha "+ qtd_sal_minimo + " salários minímos.");
        scanner.close();
    }
}
