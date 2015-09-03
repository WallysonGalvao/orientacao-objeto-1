/*
 * Escreva um programa que leia um ano e verifique se ele é bissexto.
 */
package Lista01;

// 2. Acrescente a linha import java.util.Scanner; antes da declaração da classe.
import java.util.Scanner;

// 1. Crie uma classe chamada AnoBissexto com um bloco main.
public class AnoBissexto {

    public static void main(String[] args) {
        // 3. Dentro do main, declare a variável entrada do tipo Scanner e inicialize-a com uma instância desse tipo.
        Scanner entrada = new Scanner(System.in);

        // 4. Imprima a mensagem "Entre com um ano".
        System.out.println("Entre com um ano: ");

        // 5. Declare a variável ano e inicialize-a com o resultado da chamada entrada.nextInt().
        int ano = entrada.nextInt();

        /* 
         * 6. Se ano é múltiplo de 4 e não é múltiplo de 100, ou é múltiplo de 400 
         *    então imprima Ano é bissexto. Senão imprima Ano não é bissexto. 
         *    (Dica: um número é múltiplo de outro se o resto da divisão é igual a zero).
         */
        if ((ano % 4 == 0) && (ano % 100 != 0)) {
            System.out.println("Ano é bissesto.");
        } else {
            System.out.println("Ano não é bissesto.");
        }
    }
}
// 7. Execute a classe e observe o resultado. (SHIFT + F6)