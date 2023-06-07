package unisinos.atividade;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o endereço do funcionário:");
        String endereco = scanner.nextLine();

        System.out.println("Digite o sexo do funcionário:");
        String sexo = scanner.nextLine();

        System.out.println("Digite a cor da calculadora do funcionario");
        String cor = scanner.nextLine();

        calculadora Cal = new calculadora(cor);

        FuncionarioCaixa func1 = new FuncionarioCaixa(nome, endereco, sexo, Cal);
        System.out.println("2+2 = " + func1.soma(2, 2));
        System.out.println("5-4 = " +func1.subtracao(5, 4));
        System.out.println("2x3 = " + func1.multiplica(2, 3));
        System.out.println("6/3 = " + func1.divide(6, 3));
        System.out.println("7^2 = " + func1.elevaAoQuadrado(7));
        System.out.println("8^3 = " + func1.elevaAoCubo(8));

        // FuncionarioCaixa func2 = new FuncionarioCaixa("Lucas", "Rua Borges de Medeiros", "Masculino", myCal);
        // Empresa Sinosbyte = new Empresa("Sinosbyte", func1, func2);
        // System.out.println(Sinosbyte.getFuncionario1());

        System.out.println("Digite o nome da empresa");
        String nomeEmpresa = scanner.nextLine();


        System.out.println("Digite o nome do outro funcionário:");
        String nome2 = scanner.nextLine();

        System.out.println("Digite o endereço do outro funcionário:");
        String endereco2 = scanner.nextLine();

        System.out.println("Digite o sexo do outro funcionário:");
        String sexo2 = scanner.nextLine();

        System.out.println("Digite a cor da calculadora do outro funcionario");
        String cor2 = scanner.nextLine();

        calculadora cal2 = new calculadora(cor2);
        FuncionarioCaixa func2 = new FuncionarioCaixa(nome2, endereco2, sexo2, cal2);

        Empresa empresa1 = new Empresa(nomeEmpresa, func1, func2);
        System.out.println(empresa1.imprimeInfo());

    }
}
