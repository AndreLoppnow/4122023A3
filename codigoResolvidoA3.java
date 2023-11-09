import java.util.Scanner;

public class codigoResolvidoA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro valor binário: ");
            String valor1 = scanner.next();

            System.out.print("Digite o segundo valor binário: ");
            String valor2 = scanner.next();

            int resultado = 0;

            String[] tipoOperacao = { "SOMAR", "SUBTRAIR", "MULTIPLICAR", "DIVIDIR" };
            String[] arrayNoBinario = {"2", "3", "4", "5", "6", "7", "8", "9"};
            String[] arrayBinario = {"0", "1"};

            for (int i = 0; i < arrayBinario.length; i++) {
                for (int j = 0; j < arrayNoBinario.length; j++) {

                    if (valor1.contains(arrayBinario[i]) && valor2.contains(arrayBinario[i])) {
                        if (!valor1.contains(arrayNoBinario[j]) && !valor2.contains(arrayNoBinario[j])) {

                            System.out.print("Escolha uma operação: \n");
                            int count = 0;
                            for (String item : tipoOperacao) {
                                System.out.println("[" + (count + 1) + "]" + item);
                                count++;
                            }
                            int operacao = scanner.nextInt();
                            if (operacao == 1) {
                                resultado = Integer.parseInt(valor1, 2) + Integer.parseInt(valor2, 2);
                            } else if (operacao == 2) {
                                resultado = Integer.parseInt(valor1, 2) - Integer.parseInt(valor2, 2);
                            } else if (operacao == 3) {
                                resultado = Integer.parseInt(valor1, 2) * Integer.parseInt(valor2, 2);
                            } else if (operacao == 4) {
                                resultado = Integer.parseInt(valor1, 2) / Integer.parseInt(valor2, 2);
                            } else {
                                System.out.println("Operação inválida");
                            }
                        } else {
                            System.out.println("Valores não são binários");
                            break;
                        }
                        break;
                    } else {
                        System.out.println("Valores não são binários");
                    }
                    break;
                }
                break;
            }

            System.out.println("Resultado binário: " + Integer.toBinaryString(resultado));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static Boolean PercorreArray (String[] naoBinario, String[] binario, String valor1, String valor2){
        for (int i = 0; i < naoBinario.length; i++) {
            if(valor1.contains(naoBinario[i]) || valor2.contains(naoBinario[i])){
                return true;
            }else{
            }
            return false;
        }

        for (int i = 0; i < binario.length; i++) {
            if(valor1.contains(binario[i]) || valor2.contains(naoBinario[i])){
                return true;
            }else{
                return false;
            }
        }
    } 
}
