// Nome: Lucas Lima Silva de Paula
// Matrícula: 1261937681

import java.util.Scanner;
public class exercicio09 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in); { 

              System.out.println("Preço do produto: ");
            double precoProduto = scanner.nextDouble();

            System.out.println("Valor pago: ");
            double valorPago = scanner.nextDouble();

            System.out.println("Troco: " + (valorPago - precoProduto));


            scanner.close();
   }
   }
}
