// Nome: Lucas Lima Silva de Paula
// Matrícula: 1261937681

import java.util.Scanner;

  public class exercicio08 {
    public static void main(String[] args) [
        
    Scanner scanner = new Scanner(System.in); {

            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();

            System.out.println("Fahrenheit: " + (celsius * 9/5) + 32);
            double fahrenheit = scanner.nextDouble();

            System.out.printf("Kelvin: %.2f", celsius + 273.15);

            
              scanner.close();
}
}
  }
