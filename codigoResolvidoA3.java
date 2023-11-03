package A3;

import java.util.Scanner;

public class codigoA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        try {

            String[] tipoOperacao = { "SOMAR", "SUBTRAIR", "MULTIPLICAR", "DIVIDIR" };

            System.out.print("Digite o primeiro valor binário: ");
            double valor1 = scanner.nextDouble();
            
            System.out.print("Digite o segundo valor binário: ");
            double valor2 = scanner.nextDouble();

            System.out.print("Ecolha um operação: \n");
            int i = 0;
            for (String item : tipoOperacao) {
                System.out.println("[" + (i + 1) + "]" + item);
                i++;
            }
            int operacao = scanner.nextInt();
            
            double resultado = 0;
            
            if (operacao == 1) {
                resultado = (valor1 + valor2);
            } else if (operacao == 2) {
                resultado = (valor1 - valor2);
            } else if (operacao == 3) {
                resultado = (valor1 * valor2);
            } else if (operacao == 4) {
                resultado = (valor1 / valor2);
            } else {
                System.out.println("Operação inválida.");
                return;
            }
            

            System.out.println("Resultado binário: " + Integer.toBinaryString(Math.round((float)resultado)));
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
