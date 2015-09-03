/*
 * Escreva um programa que determine se um número é par ou ímpar.
 */
package Lista01;
// 1. Crie uma classe chamada NumeroParImpar com um bloco main.

public class NumeroParImpar {

    public static void main(String[] args) {
        // 2. Dentro do main, declare a variável numero e inicialize-a com um valor.
        int numero = 10;

        /* 3. Crie uma variável resto e inicialize-a com o resto da divisão 
         * da variável numero por 2 (Dica: operador % calcula o resta da divisão).
         */
        int resto = numero % 2;

        /* 4. Se a variável resto é igual a 0 então imprima "Número é par", 
         * senão imprima "Número é impar".
         */
        if (resto == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }
    }
}
// 5. Execute a classe e observe o resultado. (SHIFT + F6)
