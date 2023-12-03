import java.util.Scanner;

public class codigoResolvidoA3 {

    public enum tipoOperacao {
        SOMAR,
        SUBTRAIR,
        MULTIPLICAR,
        DIVIDIR;
    };
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro valor binário: ");
            String valor1 = scanner.next();

            System.out.print("Digite o segundo valor binário: ");
            String valor2 = scanner.next();

            char[] binario = {'0', '1'};

            if (Valida(valor1, binario) && Valida(valor2, binario)) {
                System.out.print("Escolha uma operação: \n");

                for(tipoOperacao op : tipoOperacao.values()){
                    System.out.println("[" + op.ordinal() + "]" + op.name());
                }

                tipoOperacao operacao = getOperacao(scanner);

                if (operacao == tipoOperacao.DIVIDIR && Integer.parseInt(valor2, 2) == 0) {
                    System.out.println("Erro: Divisão por zero");
                } else {
                    realizarOperacao(operacao, valor1, valor2);
                };
 
            } else {
                System.out.println("Erro: Valores não são binários");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static tipoOperacao getOperacao(Scanner scan){
        try{
            return tipoOperacao.values()[scan.nextInt()];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: Operação inválida! Digite outro valor:");
            return getOperacao(scan);
        }
    }

    public static void realizarOperacao(tipoOperacao operacao, String valor1, String valor2) {
        int resultado = 0;
        switch (operacao) {
            case SOMAR:
                resultado = Integer.parseInt(valor1, 2) + Integer.parseInt(valor2, 2);
                break;
            case SUBTRAIR:
                resultado = Integer.parseInt(valor1, 2) - Integer.parseInt(valor2, 2);
                break;
            case MULTIPLICAR:
                resultado = Integer.parseInt(valor1, 2) * Integer.parseInt(valor2, 2);
                break;
            case DIVIDIR:
                resultado = Integer.parseInt(valor1, 2) / Integer.parseInt(valor2, 2);
                break;
        }
        System.out.println("Resultado binário: " + Integer.toBinaryString(resultado));
    }

    public static boolean Valida(String valor, char[] valores){
        for (char ch : valor.toCharArray()){
            if (!String.valueOf(valores).contains(String.valueOf(ch))){
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "CodigoResolvidoA3 []";
    }
}