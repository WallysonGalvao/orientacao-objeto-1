/*
 * Escreva um programa que imprima um array na sequência normal e na sequência invertida.
 */
package Lista02;

// 1. Crie uma classe chamada ImprimeUmArray com um bloco main.
public class ImprimeUmArray {

    public static void main(String[] args) {
        /* 
         * 2. Dentro do main, declare a variável arrayNumeros do tipo int[] 
         *    inicializando com {1,2,3,4,5,6,7,8,9,10}.
         */
        int[] arrayNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /* 
         * 3. Declare um laço que se repita de 0 até tamanho do array e imprima cada 
         *    elemento de arrayNumeros (Dica: utilize a propriedade length da variável arrayNumeros).
         */
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println(arrayNumeros[i]);
        }

        /* 
         * 4. Declare um laço que se repita de tamanho do array subtraído de 1 até 0 e imprima cada 
         *    elemento de arrayNumeros (Dica: o contador será decrementado e a parada é quando chegar a ZERO).
         */
        for (int i = arrayNumeros.length - 1; i >= 0; i--) {
            System.out.println(arrayNumeros[i]);
        }
    }
}
// 5. Execute a classe e observe o resultado.
