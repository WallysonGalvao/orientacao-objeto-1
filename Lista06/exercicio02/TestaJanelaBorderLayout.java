/*
 * Escreva um programa Java que implementa uma janela BorderLayout.
 */
package lista06.exercicio02;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 1. Crie uma classe TestaJanelaBorderLayout com um bloco main.
public class TestaJanelaBorderLayout {

    public static void main(String[] args) {
        // 2. Dentro do bloco, declare uma variável painel1 inicializando-a com uma instância de JPanel.
        JPanel painel1 = new JPanel();

        // 3. Atribua uma borda vermelha ao painel1.
        painel1.setBorder(BorderFactory.createLineBorder(Color.RED));

        // 4. Declare uma variável painel2 inicializando-a com uma instância de JPanel.
        JPanel painel2 = new JPanel();

        // 5. Atribua uma borda verde ao painel2.
        painel2.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        // 6. Declare uma variável painel3 inicializando-a com uma instância de JPanel.
        JPanel painel3 = new JPanel();

        // 7. Atribua uma borda azul ao painel3.
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        // 8. Declare uma variável painel4 inicializando-a com uma instância de JPanel.
        JPanel painel4 = new JPanel();

        // 9. Atribua uma borda preta ao painel4.
        painel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // 10. Declare uma variável painel5 inicializando-a com uma instância de JPanel.
        JPanel painel5 = new JPanel();

        /*
         * 11. Atribua uma borda branca ao painel5
         *     (Dica: chamar o método setBorder(BorderFactory.createLineBorder(Color.WHITE));).
         */
        painel5.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        // 12. Declare uma varíavel janela inicializando-a com uma instância de JFrame.
        JFrame janela = new JFrame();

        // 13. Adicione painel1 na posição superior da janela (Dica: janela.add(painel1, BorderLayout.NORTH);).
        janela.add(painel1, BorderLayout.NORTH);

        // 14. Adicione painel2 na posição inferior da janela (Dica: janela.add(painel2, BorderLayout.SOUTH);).
        janela.add(painel2, BorderLayout.SOUTH);

        // 15. Adicione painel3 na posição à esquerda da janela (Dica: janela.add(painel3, BorderLayout.EAST);).
        janela.add(painel3, BorderLayout.EAST);

        // 16. Adicione painel4 na posição à esquerda da janela (Dica: janela.add(painel4, BorderLayout.WEST);).
        janela.add(painel4, BorderLayout.WEST);

        // 17. Adicione painel5 na posição central da janela (Dica: janela.add(painel5, BorderLayout.CENTER);).
        janela.add(painel5, BorderLayout.CENTER);

        // 18. Atribua o tamanho 640x480, o título "Janela BorderLayout", o valor JFrame.EXIT_ON_CLOSE ao botão fechar, exiba a janela.
        janela.setSize(640, 480);
        janela.setTitle("Janela BorderLayout");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
// 19. Execute a classe TestaJanelaBorderLayout e observe o resultado.
