import java.util.Scanner;
import java.util.*;
public class distancia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x1, x2, x3, y1, y2, y3, distancia;    

        System.out.println("Digite os valores de:"); 
        System.out.println("x1: ");
        x1 = scanner.nextDouble();
        System.out.println("x2: ");
        x2 = scanner.nextDouble();
        System.out.println("x3: ");
        x3 = scanner.nextDouble();
        System.out.println("y1: ");
        y1 = scanner.nextDouble();
        System.out.println("y2: ");
        y2 = scanner.nextDouble();
        System.out.println("y3: ");
        y3 = scanner.nextDouble();
        System.out.printf("Ponto X(%2f, %.2f, %.2f)\n", x1, x2, x3);
        System.out.printf("Ponto Y(%2f, %.2f, %.2f)\n", y1, y2, y3);
        distancia = Math.sqrt(Math.pow((x1 - y1), 2) + Math.pow((x2 - y2), 2) + (Math.pow((x3 - y3), 2)));
        System.out.printf("A distância entre os 2 pontos é de %.2f", distancia); 
    }
}