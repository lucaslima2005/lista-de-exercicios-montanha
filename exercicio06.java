// Nome: Lucas Lima Silva de Paula
// Matrícula: 1261937681

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); {

            System.out.println("Digite a base (em cm): ");
            double base = scanner.nextDouble();

            System.out.println("Digite a altura (em cm): ");
            double altura = scanner.nextDouble();

            double area = (base * altura);

            System.out.println("Área do retângulo: " + area + " cm²");

            scanner.close();

   }
   }
}
