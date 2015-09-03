/*
 * Escreva um programa que permita ao usuário preencher um array de 10 números e, em seguida, imprima os valores lidos.
 */
package Lista02;

//2. Acrescente a linha import java.util.Scanner; antes da declaração da classe.
import java.util.Scanner;

// 1. Crie uma classe chamada LeImprimeUmArray com um bloco main.
public class LeImprimeUmArray {

    public static void main(String[] args) {
        /* 
         * 3. Dentro do main, declare a variável arrayNumeros inicializando com 10 posições de inteiros (
         *    Dica: utilize new int[10] para instanciar um array).
         */
        int[] arrayNumeros = new int[10];

        // 4. Declare a variável entrada do tipo Scanner e inicialize-a com uma instância desse tipo.
        Scanner entrada = new Scanner(System.in);
        
        // 5. Imprima a mensagem "Entre com dez números inteiros".
        System.out.println("Entre com dez números inteiros: ");
        
        // 6. Declare um laço que se repita de 0 até tamanho do array.
        for (int i = 0; i < arrayNumeros.length; i++) {
            /* 
             * 7. Dentro do laço, faça cada elemento de arrayNumeros receber o resultado da chamada entrada.nextInt() 
             *    (Dica: utilize arrayNumeros[i] para acessar cada elemento).
             */
            arrayNumeros[i] = entrada.nextInt();
        }
        
        // 8. Fora do laço, imprima a mensagem "Os dez números lidos foram".
        System.out.println("Os dez números lidos foram: ");
        
        /* 
         * 9. Declare um laço que percorra todos elementos de arrayNumeros 
         *    (Dica: utilize um foreach cuja sintaxe é for(int elemento: arrayNumeros) ).
         */
        for (int arrayNumero : arrayNumeros) {
            // 10. Dentro do laço, imprima o valor de cada elemento do array.
            System.out.println(arrayNumero);
        }
    }
}
// 11. Execute a classe e observe o resultado.