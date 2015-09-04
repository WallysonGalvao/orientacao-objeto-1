/*
 * Escreva um programa Java que implementa uma janela FlowLayout.
 */
package lista06.exercicio01;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 1. Crie uma classe TestaJanelaFlowLayout com um bloco main.
public class TestaJanelaFlowLayout {

    public static void main(String[] args) {
        // 2. Dentro do bloco, declare uma variável painel1 inicializando-a com uma instância de JPanel.
        JPanel painel1 = new JPanel();

        // 3. Atribua uma borda vermelha ao painel1 (Dica: chamar o método setBorder(BorderFactory.createLineBorder(Color.RED));).
        painel1.setBorder(BorderFactory.createLineBorder(Color.RED));

        // 4. Declare uma variável painel2 inicializando-a com uma instância de JPanel.
        JPanel painel2 = new JPanel();

        // 5.Atribua uma borda verde ao painel2 (Dica: chamar o método setBorder(BorderFactory.createLineBorder(Color.GREEN));).
        painel2.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        // 6. Declare uma variável painel3 inicializando-a com uma instância de JPanel.
        JPanel painel3 = new JPanel();

        // 7. Atribua uma borda azul ao painel3 (Dica: chamar o método setBorder(BorderFactory.createLineBorder(Color.BLUE));).
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        // 8.Declare uma variável painel4 inicializando-a com uma instância de JPanel.
        JPanel painel4 = new JPanel();

        // 9. Atribua uma borda preta ao painel4 (Dica: chamar o método setBorder(BorderFactory.createLineBorder(Color.BLACK));).
        painel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // 10. Declare uma varíavel janela inicializando-a com uma instância de JFrame.
        JFrame janela = new JFrame();

        // 11. Declare uma variável layout inicializando-a com uma instância de FlowLayout.
        //FlowLayout layout = new FlowLayout();
        
        /* 
         * 16. Feche a janela e altere a inicialização da variável layout para que os componentes sejam alinhados a direita
         *     (Dica.: new FlowLayout(FlowLayout.RIGHT);).
         */
        //FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);
        
        /* 
         * 18. Feche a janela e altere a inicialização da variável layout para que os componentes sejam alinhados a direita
         *     (Dica.: new FlowLayout(FlowLayout.RIGHT);).
         */
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);

        // 12. Atribua o layout a janela (Dica: fazer a chamada janela.setLayout(layout);).
        janela.setLayout(layout);

        // 13. Adicione painel1, painel2, painel3 e panel4 a janela (Dica: charmar o método add).
        janela.add(painel1);
        janela.add(painel2);
        janela.add(painel3);
        janela.add(painel4);

        // 14. Atribua o tamanho 640x480, o título "Janela FlowLayout", o valor JFrame.EXIT_ON_CLOSE ao botão fechar, exiba a janela.
        janela.setSize(640, 480);
        janela.setTitle("Janela FlowLayout");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }
}
// 15. Execute a classe TestaJanelaFlowLayout e observe o resultado.
// 17. Execute novamente a classe TestaJanelaFlowLayout e observe o resultado.
// 19. Execute novamente a classe TestaJanelaFlowLayout e observe o resultado.
