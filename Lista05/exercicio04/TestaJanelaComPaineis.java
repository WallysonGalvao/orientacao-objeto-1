/*
 * Escreva um programa Java que implementa uma janela contendo paineis..
 */
package lista05.exercicio04;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 1. Crie uma classe TestaJanelaComPaineis com um bloco main.
public class TestaJanelaComPaineis {

    public static void main(String[] args) {
        // 2. Dentro do bloco, declare uma variável painel1 inicializando-a com uma instância de JPanel.
        JPanel painel1 = new JPanel();

        /* 
         * 3. Atribua uma borda vermelha ao painel1
         *    (Dica: chamar o método setBorder(BorderFactory.createLineBorder(Color.RED));).
         */
        painel1.setBorder(BorderFactory.createLineBorder(Color.RED));

        // 4. Declare uma variável painel2 inicializando-a com uma instância de JPanel.
        JPanel painel2 = new JPanel();

        /* 
         * 5. Atribua uma borda verde ao painel2
         *    (Dica: chamar o método setBorder(BorderFactory.createLineBorder(Color.GREEN));).
         */
        painel2.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        // 6. Declare uma variável painel3 inicializando-a com uma instância de JPanel.
        JPanel painel3 = new JPanel();

        /*
         * 7. Atribua uma borda azul ao painel3 
         *    (Dica: chamar o método setBorder(BorderFactory.createLineBorder(Color.BLUE));).
         */
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        // 8. Declare uma variável painel4 inicializando-a com uma instância de JPanel.
        JPanel painel4 = new JPanel();

        /*
         * 9. Atribua uma borda preta ao painel4
         *    (Dica: chamar o método setBorder(BorderFactory.createLineBorder(Color.BLACK));).
         */
        painel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // 10. Adicione painel1, painel2 e painel3 ao painel4 (Dica: charmar o método add).
        painel4.add(painel1);
        painel4.add(painel2);
        painel4.add(painel3);
        
        // 11. Declare uma varíavel janela inicializando-a com uma instância de JFrame.
        JFrame janela = new JFrame();

        // 12. Adicione painel4 a janela.
        janela.add(painel4);

        // 13. Atribua o tamanho 640x480, o título "Janela com paineis", o valor JFrame.EXIT_ON_CLOSE ao botão fechar, exiba a janela.
        janela.setSize(640, 480);
        janela.setTitle("Janela com paineis");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
// 14. Execute a classe TestaJanelaComPaineis e observe o resultado.(SHIFT + F6)
