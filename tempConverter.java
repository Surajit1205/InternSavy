
import java.util.Scanner;

 public class tempConverter {
     static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


            System.out.println("Temperature Conversion Tool");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.print("Enter your choice (1 or 2): ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                double temperature = tempVal();
                double celsius = (temperature - 32) * 5 / 9;
                System.out.println(temperature + " Fahrenheit is equal to " + celsius + " Celsius.");
            } else if (choice == 2) {
                double temperature = tempVal();
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println(temperature + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }

            scanner.close();
        }
        static double tempVal () {
            System.out.print("Enter the temperature value: ");
            double temperature = scanner.nextDouble();
            return temperature;
        }


 }
