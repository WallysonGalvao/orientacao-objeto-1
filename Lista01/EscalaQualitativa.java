/*
 * Escreva um programa que associe um valor qualitativo a uma nota quantitativa 
 * (1=Ruim, 2=Insuficiente, 3=Suficiente, 4=Bom, 5=Ótimo).
 */
package Lista01;

// 2. Acrescente a linha import java.util.Scanner; antes da declaração da classe.
import java.util.Scanner;

// 1. Crie uma classe chamada EscalaQualitativa com um bloco main.
public class EscalaQualitativa {

    public static void main(String[] args) {
        // 3. Dentro do main, declare a variável entrada do tipo Scanner e inicialize-a com uma instância desse tipo.
        Scanner entrada = new Scanner(System.in);

        // 4. Imprima a mensagem "Entre com uma nota entre 1 a 5".
        System.out.print("Entre com uma nota entre 1 a 5: ");

        // 5. Declare a variável nota e inicialize-a com o resultado da chamada entrada.nextInt().
        int nota = entrada.nextInt();

        /* 6. Caso a nota seja igual a 1 imprima Ruim. 
         * Caso a nota seja igual a 2 imprima Insuficiente. 
         * Caso a nota seja igual a 3 imprima Suficiente. 
         * Caso a nota seja igual a 4 imprima Bom. 
         * Caso a nota seja 5 imprima Ótimo. 
         * Caso contrário imprima Nota inválida (Dica: utilize a sintaxe switch(nota) { case: 1; case2; ... })
         */
        switch (nota) {
            case 1:
                System.out.println("Ruim");
                break;
            case 2:
                System.out.println("insuficiente");
                break;
            case 3:
                System.out.println("Suficiente");
                break;
            case 4:
                System.out.println("Bom");
                break;
            case 5:
                System.out.println("Ótimo");
                break;
            default:
                System.out.println("Nota inválida");
        }
    }
}
// 7. Execute a classe e observe o resultado. (SHIFT + F6)