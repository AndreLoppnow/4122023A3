import java.util.Objects;
import java.util.Scanner;

public class A3arquelau {
    public static void main(String[] args) {
        // Criação do scanner
        Scanner scanner = new Scanner(System.in);

        // Criação das variáveis
        System.out.print("Digite o primeiro valor binário: ");
        String valor1 = scanner.nextLine();
        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = scanner.nextLine();
        System.out.print("Digite o segundo valor binário: ");
        String valor2 = scanner.nextLine();
        int resultado = 0;

        // Testes de erro

        // Teste para ver se alguma entrada está vazia
        if (Objects.equals(valor1, "") || Objects.equals(valor2, "") || Objects.equals(operacao, "")) {
            System.out.println("ERRO - Campo obrigatório vazio.");
            return;
        }

        // Teste para ver se a entrada é um número que extrapola o limite do tipo String
        try {
            Integer.parseInt(valor1, 2);
        } catch (NumberFormatException e1) {
            System.out.println("ERRO - A primeira entrada do usuário é um número além dos limites permitidos.");
            try {
                Integer.parseInt(valor2, 2);
            } catch (NumberFormatException e2) {
                System.out.println("ERRO - A segunda entrada do usuário também é um número além dos limites permitidos.");
                return;
            }
            return;
        }
        try {
            Integer.parseInt(valor2, 2);
        } catch (NumberFormatException e2) {
            System.out.println("ERRO - A segunda entrada do usuário é um número além dos limites permitidos.");
            return;
        }

        // Teste para ver se o número digitado é mesmo da base 2
        for (int contador = 0; contador < valor1.length(); contador++) {
            if (valor1.charAt(contador) != '0' && valor1.charAt(contador) != '1') {
                System.out.println("ERRO - Isto não é um número binário!");
                return;
            }
        }
        for (int contador = 0; contador < valor2.length(); contador++) {
            if (valor2.charAt(contador) != '0' && valor2.charAt(contador) != '1') {
                System.out.println("ERRO - Isto não é um número binário!");
                return;
            }
        }

        // Teste para ver se está tentando dividir por zero
        if ((Integer.parseInt(valor2, 2)) == 0 && Objects.equals(operacao, "/")) {
            System.out.println("ERRO - Não é possível dividir por zero!");
            return;
        }

        // Realização da operação
        try {
            if (operacao.equals("+")) {
                resultado = Integer.parseInt(valor1, 2) + Integer.parseInt(valor2, 2);
            } else if (operacao.equals("-")) {
                resultado = Integer.parseInt(valor1, 2) - Integer.parseInt(valor2, 2);
            } else if (operacao.equals("*")) {
                resultado = Integer.parseInt(valor1, 2) * Integer.parseInt(valor2, 2);
            } else if (operacao.equals("/")) {
                resultado = Integer.parseInt(valor1, 2) / Integer.parseInt(valor2, 2);
            } else {
                System.out.println("ERRO - Operação inválida.");
                return;
            }
        } catch (NumberFormatException e1) {
            System.out.println("ERRO - O resultado é um número além dos limites permitidos.");
            return;
        }

        // Amostragem do resultado em binário
        System.out.println("Resultado binário: " + Integer.toBinaryString(resultado));
    }
}