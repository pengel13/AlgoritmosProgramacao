import java.util.Scanner;

public class MathProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please choose an option from the menu below:");
            System.out.println("1. Exponentiation");
            System.out.println("2. Square Root");
            System.out.println("3. Sine");
            System.out.println("4. Cosine");
            System.out.println("5. Tangent");
            System.out.println("6. Base 10 Logarithm");
            System.out.println("0. Exit");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter base:");
                    double base = input.nextDouble();
                    System.out.println("Enter exponent:");
                    double exponent = input.nextDouble();
                    System.out.println(base + " raised to the power of " + exponent + " is " + Math.pow(base, exponent));
                    break;
                case 2:
                    System.out.println("Enter number:");
                    double number = input.nextDouble();
                    System.out.println("The square root of " + number + " is " + Math.sqrt(number));
                    break;
                case 3:
                    System.out.println("Enter angle in degrees:");
                    double angle = input.nextDouble();
                    System.out.println("The sine of " + angle + " degrees is " + Math.sin(Math.toRadians(angle)));
                    break;
                case 4:
                    System.out.println("Enter angle in degrees:");
                    angle = input.nextDouble();
                    System.out.println("The cosine of " + angle + " degrees is " + Math.cos(Math.toRadians(angle)));
                    break;
                case 5:
                    System.out.println("Enter angle in degrees:");
                    angle = input.nextDouble();
                    System.out.println("The tangent of " + angle + " degrees is " + Math.tan(Math.toRadians(angle)));
                    break;
                case 6:
                    System.out.println("Enter number:");
                    double logNumber = input.nextDouble();
                    System.out.println("The base 10 logarithm of " + logNumber + " is " + Math.log10(logNumber));
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        input.close();
    }
}
