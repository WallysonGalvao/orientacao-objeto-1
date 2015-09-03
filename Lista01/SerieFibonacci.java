/*
 * Escreva um programa que imprima os 10 primeiros números da serie de Fibonacci.
 */
package Lista01;

// 1. Crie uma classes chamada SerieFibonacci com um bloco main.
public class SerieFibonacci {

    public static void main(String[] args) {
        // 2. Dentro do main, declare as variáveis anterior, numero e proximo.
        // 3. Inicialize as variáveis numero e proximo com 0 e 1, respectivamente.
        int anterior;
        int numero = 0;
        int proximo = 1;

        // 4. Crie um laço que se repita 10 vezes.
        for (int i = 0; i < 10; i++) {
            // 5. Dentro do laço, atualize a variável anterior com a variável proximo.
            anterior = proximo;

            // 6. Dentro do laço, incremente a variável proximo com a variável numero.
            proximo += numero;

            // 7. Dentro do laço, atualize a variável numero com a variável anterior.
            numero = anterior;

            // 8. Dentro do laço, imprima a variável numero.
            System.out.println(numero);
        }
    }
}
// 9. Execute a classe e observe o resultado. (SHIFT + F6)
