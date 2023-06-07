import java.util.Scanner;
public class mediaif {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        Double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        Double nota2 = entrada.nextDouble();
        Double media = (nota1 + nota2) / 2;
        String resultado = "Notas Inválidas";
        if (media >= 0 && media <= 4){
            resultado = "Reprovado"; 
            System.out.println(resultado);
        }else if (media <=7){
            resultado = "Exame";
            System.out.println(resultado);
        }else if (media <=10){
            resultado = "Aprovado";
            System.out.println(resultado);
        }
        System.out.println("Seu resultado é: " + resultado);
        System.out.printf("Sua média foi de %.2f.", media);
        entrada.close();
    }   
}
