/*
 * Escreva um programa que leia 10 números armazenando-os em um array e, em seguida, 
 * imprima os valores do maior e do menor número..
 */
package Lista02;

// 2. Acrescente a linha import java.util.Scanner; antes da declaração da classe.
import java.util.Scanner;

// 1. Crie uma classe chamada MaiorMenorElementoDoArray com um bloco main.
public class MaiorMenorElementoDoArray {

    public static void main(String[] args) {

        // 3. Dentro do main, declare a variável arrayNumeros inicializando-a com 10 posições de inteiros.
        int[] arrayNumeros = new int[10];

        // 4. Declare também as variáveis valorMenor e valorMaior inicializando-as respectivamente com Integer.MAX_VALUE e Integer.MIN_VALUE.
        int valorMenor = Integer.MAX_VALUE;
        int valorMaior = Integer.MIN_VALUE;

        // 5. Imprima a mensagem "Entre com dez números inteiros".
        System.out.println("Entre com dez números inteiros: ");

        // 6. Declare a variável entrada do tipo Scanner e inicialize-a com uma instância desse tipo.        
        Scanner entrada = new Scanner(System.in);

        // 7. Declare um laço que se repita de 0 até tamanho do array.
        for (int i = 0; i < arrayNumeros.length; i++) {
            // 8. Dentro do laço, faça cada elemento de arrayNumeros receber o resultado da chamada entrada.nextInt()
            arrayNumeros[i] = entrada.nextInt();

            // 9. Dentro do laço, verifique se o elemento lido é maior que a variável valorMaior, então atribua o elemento a variável valorMaior.
            if (arrayNumeros[i] > valorMaior) {
                valorMaior = arrayNumeros[i];
            }
            // 10. Dentro do laço, verifique se o elemento lido é menor que a variável valorMenor, então atribua o elemento a variável valorMenor.
            if (arrayNumeros[i] < valorMenor) {
                valorMenor = arrayNumeros[i];
            }
        }
        // 11. Imprima as variáveis valorMaior e valorMenor.
        System.out.println("Valor Maior: " + valorMaior);
        System.out.println("Valor Menor: " + valorMenor);
    }
}
// 12. Execute a classe e observe o resultado.
