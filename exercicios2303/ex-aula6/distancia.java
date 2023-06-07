import java.util.Scanner;
import java.math.*;
public class distancia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a coordenada x do ponto 1: ");
        Double x1 = scanner.nextDouble();
        System.out.println("Digite a coordenada y do ponto 1: ");
        Double y1 = scanner.nextDouble();

        System.out.println("Digite a coordenada x do ponto 2: ");
        Double x2 = scanner.nextDouble();
        System.out.println("Digite a coordenada y do ponto 1: ");
        Double y2 = scanner.nextDouble();
    
        Double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));
        System.out.printf("A distância entre o primeiro e o segunto ponto é de %.2f", d);
        scanner.close();
    }
}
