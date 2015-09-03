/*
 * Escreva um programa que armazene em um array multitimensional as notas dos alunos 
 * e calcule a média final. Em seguida, imprima essas notas.
 */
package Lista02;

// 2. Acrescente a linha import java.util.Scanner; antes da declaração da classe.
import java.util.Scanner;

// 1. Crie uma classe chamada CalculoBoletim com um bloco main.
public class CalculoBoletim {
    public static void main(String[] args) {
        // 3. Dentro do main, declare a variável arrayNotas 5X3 (Dica: double[][] arrayNotas = new double[10][3]).
        double[][] arrayNotas = new double [5][3];
        
        // 4. Declare a variável entrada do tipo Scanner e inicialize-a com uma instância desse tipo.
        Scanner entrada = new Scanner(System.in);
        
        // 5. Declare um laço que se repita de 0 até o tamanho do arrayNotas.
        for (int i = 0; i < arrayNotas.length; i++) {
            // 6. Dentro do laço, imprima a mensagem "Entre com a nota A1".
            System.out.println("Entre com a nota A1");
            
            // 7. Ainda no laço, atualize a posição ZERO de arrayNotas[i] (arrayNotas[i][0]) com o resultado de entrada.nextDouble().
            arrayNotas[i][0] = entrada.nextDouble();
            
            // 8. Dentro do laço, imprima a mensagem "Entre com a nota A2".
            System.out.println("Entre com a nota A2");
            
            // 9. Ainda no laço, atualize a posição UM de arrayNotas[i] (arrayNotas[i][1]) com o resultado de entrada.nextDouble().
            arrayNotas[i][1] = entrada.nextDouble();
            
            // 10. Ainda no laço, atualize a posição DOIS arrayNotas[i] com a média aritmética de A1 e A2 (Dica: arrayNotas[i][0] + arrayNotas[i][1] / 2).
            arrayNotas[i][2] = (arrayNotas[i][0] + arrayNotas[i][1] / 2);
        }
        
        // 11. Fora do laço, declare um laço que se repita de 0 até o tamanho do arrayNotas.
        for (int i = 0; i < arrayNotas.length; i++) {
            // 12. Dentro do laço, imprima as notas e a média de cada aluno.
            System.out.println("Média: " + arrayNotas[i][2]);            
        }
    }
}
// 13. Execute a classe e observe o resultado.