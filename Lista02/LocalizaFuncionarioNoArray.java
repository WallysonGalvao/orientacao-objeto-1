/*
 * Escreva um programa que localize um funcionário em um array multidimensional 
 * a partir da matricula e, em seguida, imprima o respectivo telefone.
 */
package Lista02;

// 2. Acrescente a linha import java.util.Scanner; antes da declaração da classe.
import java.util.Scanner;

// 1. Crie uma classe chamada LocalizaFuncionarioNoArray com um bloco main.
public class LocalizaFuncionarioNoArray {

    public static void main(String[] args) {
        /* 3. Dentro do main, declare a variável arrayFuncionarios inicializando-a com 
         {{1111,30001000}, {2222,30002000}, {3333,30003000}, {4444,30004000},
         {5555,30005000}, {6666,30006000}, {7777,30007000}}.
         */
        
        int[][] arrayFuncionarios = {{1111, 30001000},
                                     {2222, 30002000},
                                     {3333, 30003000},
                                     {4444, 30004000},
                                     {5555, 30005000},
                                     {6666, 30006000},
                                     {7777, 30007000}};
        
        // 4. Declare a variável entrada do tipo Scanner e inicialize-a com uma instância desse tipo.
        Scanner entrada = new Scanner(System.in);
        
        // 5. Imprima a mensagem "Entre com uma matrícula".
        System.out.print("Entre com uma matrícula: ");
        
        // 6. Declare a variável matricula inicializando-a com o resultado de entrada.nextInt().
        int matricula = entrada.nextInt();
        
        // 7. Declara a variável achou inicializando-a com o valor false.
        boolean achou = false;
        
        // 8. Declare um laço que se repita de 0 até o tamanho do array.
        for (int i = 0; i < arrayFuncionarios.length; i++) {
            /* 9. Dentro do laço, se a variável matricula é igual a posição ZERO do elemento arrayFuncionarios[i] 
                  (i.e. arrayFuncionarios[i][0]), então imprima o valor da posição UM do elemento arrayFuncionarios[i] 
                  (i.e. arrayFuncionarios[i][1]). Em seguida, atualize a variável achou com o valor true e interrompa o laço 
                  (Dica: utilizar a instrução break).
            */
            if (matricula == arrayFuncionarios[i][0]) {
                System.out.println(arrayFuncionarios[i][1]);
                achou = true;
                break;
            }            
        }
        // 10. Fora do laço, verifique se a variável achou é igual a false, então imprima a mensagem "Matrícula não encontrada".
        if (achou == false) {
            System.out.println("Matrícula não encontrada");
        }
    }
}
// 11. Execute a classe e observe o resultado.