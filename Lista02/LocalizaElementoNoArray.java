/*
 * Escreva um programa que imprima o valor do elemento de um array a partir do índice informado pelo usuário.
 */
package Lista02;

// 2. Acrescente a linha import java.util.Scanner; antes da declaração da classe.
import java.util.Scanner;

// 1. Crie uma classe chamada LocalizaElementoNoArray com um bloco main.
public class LocalizaElementoNoArray {

    public static void main(String[] args) {
        // 3. Dentro do main, declare a variável arrayNumeros do tipo int[] inicializando com {5,2,6,7,9,10,1,4,3,8}.
        int[] arrayNumeros = {5, 2, 6, 7, 9, 10, 1, 4, 3, 8};

        /* 
         * 4. Declare a variável entrada do tipo Scanner e inicialize-a com uma instância desse tipo 
         *    (Dica: utilize new Scanner(System.in) para criar a instância).
         */
        Scanner entrada = new Scanner(System.in);

        // 5. Imprima a mensagem "Entre com um índice".
        System.out.print("Entre com um índice: ");

        // 6. Declare a varíavel indice e inicialize-a com o resultado da chamada entrada.nextInt().
        int indice = entrada.nextInt();

        // 7. Imprima o elemento de arrayNumeros na posição indice.
        for (int i = 0; i < arrayNumeros.length; i++) {
            if (indice == i) {
                System.out.println("Posição no array: " + arrayNumeros[i]);
            }            
        }        
    }
}
// 8. Execute a classe e observe o resultado.
