/*
 * Escreva um programa que imprima todos os múltiplos de 3, entre 1 e 100.
 */
package Lista01;

// 1. Crie uma classes chamada MultiplosDeTres com um bloco main.
public class MultiplosDeTres {

    public static void main(String[] args) {
        /* 2. Dentro do main, declare um laço que se repita de 1 a 100 
         * (Dica: digite for e pressione as teclas CTRL ESPAÇO para listar as formas de laço).
         */
        for (int i = 0; i < 100; i++) {
            /* 3. Dentro do laço, se o resto da divisão da variável i (contador) 
             * por 3 é igual a zero então imprima o valor de i.
             */
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
// 4. Execute a classe e observe o resultado. (SHIFT + F6)
