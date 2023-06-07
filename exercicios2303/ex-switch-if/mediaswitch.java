import java.util.Scanner;
public class mediaswitch {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        Double nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        Double nota2 = entrada.nextDouble();
        Double media = (nota1 + nota2) / 2;
        char resultado;
        resultado = 'D';
        if (media >= 0 && media <= 4){
            resultado = 'C'; 
        }else if (media <=7){
            resultado = 'B';
        }else if (media <=10){
            resultado = 'A';
        }
        switch(resultado){
            case 'A':
                System.out.println("Aprovado");
                break;
            case 'B':
                System.out.println("Exame");
                break;
            case 'C':
                System.out.println("Reprovado");
                break;
        }
        entrada.close();
    }
}


