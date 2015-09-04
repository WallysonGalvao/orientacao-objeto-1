/*
 * Escreva um programa Java que implementa uma janela GridLayout.
 */
package lista06.exercicio03;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 1. Crie uma classe TestaJanelaGridLayout com um bloco main.
public class TestaJanelaGridLayout {

    public static void main(String[] args) {
        // 2. Dentro do bloco, declare uma variável painel1 inicializando-a com uma instância de JPanel.
        JPanel painel1 = new JPanel();

        // 3. Declare uma variável painel2 inicializando-a com uma instância de JPanel.
        JPanel painel2 = new JPanel();

        // 4. Declare uma variável painel3 inicializando-a com uma instância de JPanel.
        JPanel painel3 = new JPanel();

        // 5. Declare uma variável painel4 inicializando-a com uma instância de JPanel.
        JPanel painel4 = new JPanel();

        // 6. Declare uma variável painel5 inicializando-a com uma instância de JPanel.
        JPanel painel5 = new JPanel();
        
        // 7. Atribua uma borda preta aos paineis.
        painel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        // 8. Declare uma varíavel janela inicializando-a com uma instância de JFrame.
        JFrame janela = new JFrame();
        
        // 9. Declare uma variável layout inicializando-a com uma instância de GridLayout 3x2 (Dica: new GridLayout(3, 2);).
        GridLayout layout = new GridLayout(3, 2);
        
        // 10. Atribua o layout a janela.
        janela.setLayout(layout);
        
        // 11. Adicione todos os paineis a janela.
        janela.add(painel1);
        janela.add(painel2);
        janela.add(painel3);
        janela.add(painel4);
        janela.add(painel5);
        
        // 12. Atribua o tamanho 640x480, o título "Janela GridLayout", o valor JFrame.EXIT_ON_CLOSE ao botão fechar, exiba a janela.
        janela.setSize(640, 480);
        janela.setTitle("Janela GridLayout");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
// 13. Execute a classe TestaJanelaGridLayout e observe o resultado.