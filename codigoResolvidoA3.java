package A3;

import java.lang.reflect.Executable;
import java.util.Scanner;

public class codigoResolvidoA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            int maxTamanho = 35;

                System.out.print("Digite o primeiro valor binário: ");
                String valor1 = scanner.next();
                
                System.out.print("Digite o segundo valor binário: ");
                String valor2 = scanner.next();
            
            int resultado = 0;

            //Array com as opções de operação
            String[] tipoOperacao = { "SOMAR", "SUBTRAIR", "MULTIPLICAR", "DIVIDIR" };
            //Array que armazena todos os numero não binarios para validação
            String[] arrayNoBinario = {"2", "3", "4", "5", "6", "7", "8", "9"};
            //Array que armazena apenas os binarios
            String[] arrayBinario = {"0", "1"};

            if(valor1.length() < maxTamanho && valor2.length() < maxTamanho){
                //For que percorre o arrayBinario
                for (int i = 0; i < arrayBinario.length; i++) {
                    //For que percorre o arrayNoBinario
                    for (int j = 0; j < arrayNoBinario.length; j++) {
    
                        //Primeira condição de validaão para verifiar se há existencia de números binários
                        if (valor1.contains(arrayBinario[i]) && valor2.contains(arrayBinario[i])) {
                            //Segunda condição de validaão para verifiar se há existencia de números NÃO binários
                            if(!valor1.contains(arrayNoBinario[j]) && !valor2.contains(arrayNoBinario[j])){
    
                                //Trecho de código responsável pela exibição das opções em tela
                                System.out.print("Ecolha um operação: \n");
                                int count = 0;
                                for (String item : tipoOperacao) {
                                    //Exibite na tela o que esta armazenado no Array tipoOperacao e um numero de escolha
                                    System.out.println("[" + (count + 1) + "]" + item);
                                    count++;
                                }
                                //recebe o número de escolha
                                int operacao = scanner.nextInt();
    
                                //Aqui será onde as operações aconteceram quando escolher uma opção
                                if (operacao == 1) {
                                    resultado = Integer.parseInt(valor1, 2) + Integer.parseInt(valor2, 2);
                                } else if (operacao == 2) {
                                    resultado = Integer.parseInt(valor1, 2) - Integer.parseInt(valor2, 2);
                                } else if (operacao == 3) {
                                    resultado = Integer.parseInt(valor1, 2) * Integer.parseInt(valor2, 2);
                                } else if (operacao == 4) {
                                    resultado = Integer.parseInt(valor1, 2) / Integer.parseInt(valor2, 2);
                                } else {
                                    System.out.println("Operação invalida");
                                }
                                
                                System.out.println(" " + "Resultado binário: " + Integer.toBinaryString(resultado));
                            } else {
                                System.out.println("Valores não são binários");
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
            } else{
                System.out.println("!! SPAM !!");
            }
            

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
