/*
 * Escreva um programa Java que implemente uma caixa de diálogo.
 */
package lista04.exercicio02;

// 3. Importe a classe javax.swing.JDialog.
import javax.swing.JDialog;

// 1. Crie uma classe TestaCaixaDialogo com o bloco main.
public class TestaCaixaDialogo {

    public static void main(String[] args) {
        // 2. Dentro do bloco, defina uma variável caixaDialogo inicializando-a com uma instância de JDialog.
        JDialog caixaDialogo = new JDialog();

        // 4. Define o título "Caixa de diálogo" para a variável caixaDialogo.
        caixaDialogo.setTitle("Caixa de diálogo");

        // 5. Defina o tamanho 320x240 para a variável caixaDialogo.
        caixaDialogo.setSize(320, 240);

        // 6. Faça o botão fechar da variável caixaDialogo interromper a execução do programa.
        caixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        // 7. Torne a caixa de diálogo visível.
        caixaDialogo.setVisible(true);

        /* 
         * 9. Feche a caixa de diálogo e acrescente a chamada setLocationRelativeTo da variável
         *    caixaDialogo passando como parâmetro o valor true.
         */
        caixaDialogo.setLocationRelativeTo(null);
    }
}
// 8. Execute a classe TestaCaixaDialogo e observe o resultado. (SHIFT + F6)

// 10. Execute a classe TestaCaixaDialogo e observe o resultado.
