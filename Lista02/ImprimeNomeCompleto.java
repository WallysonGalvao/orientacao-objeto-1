/*
 * Escreva um programa que leia um nome completo de uma pessoa e o exiba com a 
 * primeira letra de cada palavra em maiúsculas (exceto as preposições de, da, dos, das, e).
 */
package Lista02;

// 2. Acrescente a linha import java.util.Scanner; antes da declaração da classe.
import java.util.Scanner;

// 1. Crie uma classe chamada ImprimeNomeCompleto com um bloco main.
public class ImprimeNomeCompleto {

    public static void main(String[] args) {
        // 3. Dentro do main, declare a variável entrada do tipo Scanner e inicialize-a com uma instância desse tipo.
        Scanner entrada = new Scanner(System.in);

        // 4. Imprima a mensagem "Entre com um nome completo".
        System.out.println("Entre com um nome completo");

        // 5. Declare a variável nomeCompleto e inicialize-a com o resultado da chamada entrada.nextLine().
        String nomeCompleto = entrada.nextLine();

        // 6. Converta o valor da variável nomeCompleto para minúsculo.
        nomeCompleto = nomeCompleto.toLowerCase();

        /* 
         * 7. Declare uma variável arrayNome do tipo String[] e inicialize-a com cada parte de nomeCompleto 
         *    (Dica: utilize a chamada nome.split(" ") para particionar o nome).
         */
        String[] arrayNome = nomeCompleto.split(" ");

        // 8. Declare a variável nomeCorrigido e inicialize-a com "".
        String nomeCorrigido = "";

        // 9. Declare um laço que se repita até o tamanho do arrayNome (Dica: utilizar a propriedade length do array).
        for (int i = 0; i < arrayNome.length; i++) {
            /* 
             * 10. Dentro do laço verifique se cada elemento do array é uma preposição
             *     (Dica: utilize a chamada "e da das de do dos".contains(arrayNome[i]) para essa verificação).
             */

            /* 
             * 11. Se for uma preposição concatene a variável nomeCorrigido com o elemento do array e um espaço em branco " ", armazenando o resultado em nomeCorrigido
             *     (Dica: operador + faz a concatenação de String).
             */
            
            /* 
             * 12. Caso contrário, declare uma variável caracterInicial do tipo Character inicializando-a com a primeira letra do elemento 
             *     (Dica: faça chamada arrayNome[i].charAt(0) para obter o primeiro caracter)
             */
            if ("e da das de do dos".contains(arrayNome[i])) {
                nomeCorrigido = nomeCorrigido + arrayNome[i] + " ";
            } else {
                Character caracterInicial = arrayNome[i].charAt(0);
                /* 
                 * 13. Altere o valor da variável caracterInicial para maiúsculo
                 *     (Dica: faça a chamada Character.toUpperCase(caracterIncial) armazendando o resultado na varíavel).
                 */
                caracterInicial = Character.toUpperCase(caracterInicial);

                /* 
                 * 14. Concatene na variável nomeCorrigido com a variável caracterInicial, o elemento do array sem o primeiro caracter e um espaço em branco " ".
                 *     (Dica: a chamada arrayNome[i].substring(1) remove o primeiro caracter de uma string).
                 */
                nomeCorrigido += caracterInicial + arrayNome[i].substring(1) + " ";
            }
        }
        // 15. Imprima a mensagem "O nome informado foi".        
        // 16. Imprima a variável nomeCorrigido.
        System.out.println("O nome informado foi: " + nomeCorrigido);
    }
}
// 17. Execute a classe e observe o resultado.
