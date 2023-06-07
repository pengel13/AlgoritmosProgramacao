import java.util.Scanner;
public class horario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as horas do primeiro horario: ");
        int hora1 = scanner.nextInt();
        System.out.println("Digite os minutos do primeiro horario: ");
        int min1 = scanner.nextInt();
        System.out.println("Digite os segundo do primeiro horário: ");
        int sec1 = scanner.nextInt();

        System.out.println("Digite as horas do segundo horario: ");
        int hora2 = scanner.nextInt();
        System.out.println("Digite os minutos do segundo horario: ");
        int min2 = scanner.nextInt();
        System.out.println("Digite os segundo do segundo horário: ");
        int sec2 = scanner.nextInt();
        System.out.printf("Primeiro horário: %d:%d:%d", hora1, min1, sec1);
        System.out.printf("\nSegundo horário: %d:%d:%d", hora2, min2, sec2);
        int intervalo_hora = hora2 - hora1;
        int intervalo_minuto = min2- min1;
        int intervalo_segundo = sec2 - sec1;
        if (intervalo_segundo < 0){
            intervalo_minuto -= 1;
            intervalo_segundo += 60;
        }
        if (intervalo_minuto < 0){
            intervalo_hora -= 1;
            intervalo_minuto += 60;
        }
        System.out.printf("\n O intervalo entre os horários é: %2d:%2d:%2d", intervalo_hora, intervalo_minuto, intervalo_segundo);
        scanner.close();

    }
}
