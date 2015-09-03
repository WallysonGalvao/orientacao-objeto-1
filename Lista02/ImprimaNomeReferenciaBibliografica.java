/*
 * Escreva um programa que leia um nome completo de uma pessoa e o exiba no formato de referência bibliográfica (Último Nome, Restante do Nome).
 */
package Lista02;
// 2. Acrescente a linha import java.util.Scanner; antes da declaração da classe.
import java.util.Scanner;

// 1. Crie uma classe chamada ImprimaNomeReferenciaBibliografica com um bloco main.
public class ImprimaNomeReferenciaBibliografica {

    public static void main(String[] args) {
        // 3. Dentro do main, declare a variável entrada do tipo Scanner e inicialize-a com uma instância desse tipo.
        Scanner entrada = new Scanner(System.in);

        // 4. Imprima a mensagem "Entre com um nome completo".
        System.out.println("Entre com um nome completo: ");

        // 5. Declare a variável nomeCompleto e inicialize-a com o resultado da chamada entrada.nextLine().
        String nomeCompleto = entrada.nextLine();

        // 6. Declare as variáveis ultimoNome e restoNome como string.
        String ultimoNome;
        String restoNome;

        // 7. Declare a variável posicao e inicialize-a com a chamada nomeCompleto.lastIndexOf(" ").
        int posicao = nomeCompleto.lastIndexOf(" ");

        // 8. Atualize a variável ultimoNome com a chamada nomeCompleto.substring(posicao).
        ultimoNome = nomeCompleto.substring(posicao);

        // 9. Atualize a variável restoNome com a chamada nomeCompleto.substring(0, posicao-1).
        restoNome = nomeCompleto.substring(0, posicao);

        // 10. Se o ultimoNome é igual a Filho, Júnior ou Neto, atualize a varíavel posicao com a chamada restoNome.lastIndexOf(" ").
        /* 
         * 11. Em seguida, concatene a chamada restoNome.substring(posicao) com um espaço em braco " " 
         *     e a variável ultimoNome armazenando o resultado na varíavel ultimoNome.
         */
        
        // 12. Por último, atualize a variável restoNome com a chamada restoNome.substring(0, posicao-1).
        if (ultimoNome.equals("Filho") || ultimoNome.equals("Júnior") || ultimoNome.equals("Neto")) {
            posicao = restoNome.lastIndexOf(" ");
            ultimoNome = restoNome.substring(posicao) + "" + ultimoNome;
            restoNome = restoNome.substring(0, posicao -1);
        }
        
        // 13. Imprima a mensagem "O nome usado como referência bibliográfica será".
        System.out.println("O nome usado como referência bibliográfica será: ");

        // 14. Imprima as variáveis ultimoNome e restoNome no formato de referência bibliográfica.
        System.out.println("Último nome: " + ultimoNome);
        System.out.println("Restante do nome: " + restoNome);
    }
}
// 15. Execute a classe e observe o resultado.
