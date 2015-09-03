/*
 * Escreva um programa que receba um verbo regular terminado em AR e mostre a conjugação no presente. 
 */
package Lista02;

// 2. Acrescente a linha import java.util.Scanner; antes da declaração da classe.
import java.util.Scanner;

// 1. Crie uma classe chamada ConjugaVerboRegularSufixoAr com um bloco main.
public class ConjugaVerboRegularSufixoAr {

    public static void main(String[] args) {
        // 3. Dentro do main, declare a variável entrada do tipo Scanner e inicialize-a com uma instância desse tipo.
        Scanner entrada = new Scanner(System.in);

        // 4. Imprima a mensagem "Entre com um verbo regular terminado em AR".
        System.out.println("Entre com um verbo regular terminado em AR");

        // 5. Declare a variável verbo e inicialize-a com o resultado da chamada entrada.nextLine().
        String verbo = entrada.nextLine();

        // 6. Converta o verbo para maiúsculo (Dica: atualize a variável verbo com o resultado de verbo.toUpperCase() ).
        verbo = verbo.toUpperCase();

        /* 
         * 7. Se o verbo não termina em AR imprima a mensagem "Verbo não terminado em AR" 
         *    (Dica: compare o resultado de verbo.endsWith("AR") com o valor false).
         */
        /* 
         * 8. Caso termine em AR, remova o sufixo AR do verbo 
         *    (Dica: atualize a variável verbo com o resultado da chamada verbo.substring(0, verbo.length()-2) ).
         */
        if (!verbo.endsWith("AR")) {
            System.out.println("Verbo não terminado em AR");
        } else {
            verbo = verbo.substring(0, verbo.length() - 2);
        }
        // 9. Imprima a mensagem "A conjugação do verbo no presente é".
        System.out.println("A conjugação do verbo no presente é: ");

        /* 
         * 10. Imprima a conjugação no presente, por exemplo EU DIGIT+O, TU DIGIT+AS, ELE DIGIT+A, NÓS DIGIT+AMOS, VÓIS DIGIT+AIS, ELES DIGIT+AM
         *     (Dica: concatenar a variável verbo com cada pronome e sufixo).
         */
        System.out.println("EU "   + verbo + "O");
        System.out.println("TU "   + verbo + "AS");
        System.out.println("ELE "  + verbo + "A");
        System.out.println("NÓS "  + verbo + "AMOS");
        System.out.println("VÓIS " + verbo + "AIS");
        System.out.println("ELES " + verbo + "AM");
    }
}
// 11. Execute a classe e observe o resultado.
