/*
 * Escreva um programa que leia dois números inteiros e determine qual é o menor.
 */
package Lista01;

// 2. Acrescente a linha import java.util.Scanner; antes da declaração da classe.
import java.util.Scanner;

// 1. Crie uma classe chamada MenorNumero com um bloco main.
public class MenorNumero {

    public static void main(String[] args) {
        /* 3. Dentro do main, declare a variável entrada do tipo Scanner e inicialize-a 
         * com uma instância desse tipo (Dica: utilize new Scanner(System.in) para criar a instância).
         */
        Scanner entrada = new Scanner(System.in);

        // 4. Imprima a mensagem "Entre com um valor inteiro para X".
        System.out.print("Entre com um valor inteiro para X: ");

        // 5. Declare a variável numeroX e inicialize-a com o resultado da chamada entrada.nextInt().
        int numeroX = entrada.nextInt();

        // 6. Imprima a mensagem "Entre com um valor inteiro para Y".
        System.out.print("Entre com um valor inteiro para Y: ");

        // 7. Declare a variável numeroY e inicialize-a com o resultado da chamada entrada.nextInt().
        int numeroY = entrada.nextInt();

        // 8. Se numeroX é menor que numeroY então imprima a variável numeroX, senão imprima a variável numeroY.
        if (numeroX < numeroY) {
            System.out.println(numeroX);
        } else {
            System.out.println(numeroY);
        }
    }
}
// 9. Execute a classe e observe o resultado. (SHIFT + F6)
