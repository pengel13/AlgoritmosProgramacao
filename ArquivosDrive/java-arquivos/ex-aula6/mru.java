import java.util.Scanner;
public class mru {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("EQUAÇÃO DO MRU");
        System.out.println("Digite a distância em kilometros: ");
        String distancia = scanner.nextLine();
        System.out.println("Digite a velocidade em km/h: ");
        String velocidade = scanner.nextLine();
        System.out.println("Digite o tempo em horas: ");
        String tempo = scanner.nextLine();

        if (tempo.length() == 0){
            Double v = Double.parseDouble(velocidade);
            Double d = Double.parseDouble(distancia);
            Double t = d/v;
            System.out.printf("Tempo é %.3f horas", t);
        }
        else if (distancia.length() == 0){
            Double t = Double.parseDouble(tempo);
            Double v = Double.parseDouble(velocidade);
            Double d = v*t;
            System.out.printf("A distância é de %.3f kilômetros", d);
        }
        else if (velocidade.length() == 0){
            Double t = Double.parseDouble(tempo);
            Double d = Double.parseDouble(distancia);
            Double v = d/t;
            System.out.printf("A velocidade é de %.3f km/h", v);
        }
        scanner.close();
        

    }
    
}
