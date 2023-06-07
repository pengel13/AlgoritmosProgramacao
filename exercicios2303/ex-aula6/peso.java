import java.util.Scanner;
public class peso {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura em metros: ");
        Double altura = scanner.nextDouble();
        System.out.println("Digite seu sexo: [M para Masculino]\n[F para Feminino]");
        char sexo = scanner.next().charAt(0);
        Double peso_ideal = 0.0;
        if (sexo== 'M'){
            peso_ideal = 72.7 * altura - 58; 
        }
        else if (sexo == 'F'){
            peso_ideal = 62.1 * altura - 44.7;
        }
        System.out.println("Digite seu peso em kilogramas: ");
        Double peso = scanner.nextDouble();
        if (peso<= peso_ideal*1.05 && peso >= peso_ideal*0.95){
            System.out.println("Você está dentro do interavalo do peso ideal");
        }
        else if (peso >= peso_ideal * 1.05){
            System.out.println("Você está acima do peso ideal");
        }
        else{
            System.out.println("Você está abaixo do peso ideal");
        }
        System.out.printf("Seu peso ideal %.2f ", peso_ideal);
        scanner.close();
    }
    
}
