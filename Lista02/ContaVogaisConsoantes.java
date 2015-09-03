/*
 * Escreva um programa que leia uma frase e calcule a quantidade de vogais e de consoantes contidas nela.
 */
package Lista02;

// 2. Acrescente a linha import java.util.Scanner; antes da declaração da classe.
import java.util.Scanner;

// 1. Crie uma classe chamada ContaVogaisConsoantes com um bloco main.
public class ContaVogaisConsoantes {

    public static void main(String[] args) {
        // 3. Dentro do main, declare a variável entrada do tipo Scanner e inicialize-a com uma instância desse tipo.
        Scanner entrada = new Scanner(System.in);

        // 4. Imprima a mensagem "Entre com uma frase qualquer".
        System.out.println("Entre com um frase qualquer");

        // 5. Declare a variável frase e inicialize-a com o resultado da chamada entrada.nextLine().
        String frase = entrada.nextLine();

        // 6. Converta a frase para minúscula (Dica: atualize a variável frase com o resultado da chamada frase.toLowerCase() ).
        frase = frase.toLowerCase();

        // 7. Declare as variáveis quantidadeVogais e quantidadeConsoantes, inicializando-as com ZERO.
        int quantidadeVogais = 0;
        int quantidadeConsoantes = 0;

        // 8. Declare um laço que se repita de 0 até o tamanho da frase (Dica: utilize a chamada frase.length() para obter o tamanho da frase).
        for (int i = 0; i < frase.length(); i++) {
            // 9. Dentro do laço, declare a variável letra do tipo Character inicializando-a com o resultado da chamada frase.charAt(i).
            Character letra = frase.charAt(i);

            /* 
             * 10. Dentro do laço, verifique se a letra é uma vogal e então incremente a variável quantidadeVogais 
             *     (Dica: utilize a chamada "aáàâãeéèêiíìîoóòôõuúùûü".contains(letra.toString()) para testar é uma vogal).
             */
            if ("aáàâãeéèêiíìîoóòôõuúùûü".contains(letra.toString())) {
                quantidadeVogais++;
            }

            /* 
             * 11. Dentro do laço, verifique se a letra é uma consoante e então incremente a variável quantidadeConsoantes 
             *     (Dica: utilize a chamada "bcdfghjklmnpqrstvwxyzç".contains(letra.toString()) para testar é uma vogal).
             */
            if ("bcdfghjklmnpqrstvwxyzç".contains(letra.toString())) {
                quantidadeConsoantes++;
            }
        }
        // 12. Fora do laço, imprima a quantidade de caracteres na frase, a quantidade de vogais e a quantidade de consoantes.
        System.out.println("Vogais: " + quantidadeVogais);
        System.out.println("Consoantes: " + quantidadeConsoantes);
    }
}
// 13. Execute a classe e observe o resultado.
