package A3;

import java.util.Scanner;

public class codigoResolvidoA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        try {

            String[] tipoOperacao = { "SOMAR", "SUBTRAIR", "MULTIPLICAR", "DIVIDIR" };

            System.out.print("Digite o primeiro valor binário: ");
            int valor1 = scanner.nextInt();
            
            System.out.print("Digite o segundo valor binário: ");
            int valor2 = scanner.nextInt();

            System.out.print("Ecolha um operação: \n");
            int i = 0;
            for (String item : tipoOperacao) {
                System.out.println("[" + (i + 1) + "]" + item);
                i++;
            }
            int operacao = scanner.nextInt();
            
            int resultado = 0;
            
            if (operacao == 1) {
                resultado = (valor1 + valor2);
            } else if (operacao == 2) {
                resultado = (valor1 - valor2);
            } else if (operacao == 3) {
                resultado = (valor1 * valor2);  
            } else if (operacao == 4) {
                if(valor1 != 0 && valor2 != 0){
                    resultado = (valor1 / valor2);
                }else {
                    System.out.println("Não é possível dividir por zero");
                }
            } else {
                System.out.println("Operação inválida.");
                return;
            }
            

            System.out.println("Resultado binário: " + Integer.toBinaryString(resultado));
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
