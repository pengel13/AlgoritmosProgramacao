import java.util.Scanner;
public class temperatura {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a temperatura em graus Celsius? ");
        int n = scanner.nextInt();
        String estado;
        if (n<0){
            estado = "sólido";
        }else if(n>100){
            estado = "gasoso";
        }else{
            estado = "líquido";
        }
        System.out.printf("A água a temperatura de %d graus Celsius está no estado %s.", n, estado);
        scanner.close();


    }
}
