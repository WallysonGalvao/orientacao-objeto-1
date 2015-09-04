/*
 * Escreva um programa que implementa uma janela contendo um painel de rolagem.
 */
package lista05.exercicio05;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

// 1. Crie uma classe TestaJanelaComRolagem com um bloco main.
public class TestaJanelaComRolagem {
    public static void main(String[] args) {
        // 2. Dentro do bloco, declare uma variável painelComum inicializando-a com uma instância de JPanel.
        JPanel painelComum = new JPanel();
        
        // 3. Atribua uma borda azul ao painelComum.
        painelComum.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        
        // 4. Atribua o tamanho 800x600 ao painelComum (Dica: chamar o método setPreferredSize(new Dimension(800,600));).
        painelComum.setPreferredSize(new Dimension(800,600));
        
        // 5. Declare uma variável painelRolagem inicializando-a com uma instância de JScrollPane.
        JScrollPane painelRolagem = new JScrollPane();
        
        // 6. Adicione o painelComum ao painelRolagem (Dica: chamar o método setViewportView(painelComum);).
        painelRolagem.setViewportView(painelComum);
        
        // 7. Declare uma varíavel janela inicializando-a com uma instância de JFrame.
        JFrame janela = new JFrame();
        
        // 8. Adicione painelRolagem a janela.
        janela.add(painelRolagem);
        
        // 9. Atribua o tamanho 640x480, o título "Janela com paineis", o valor JFrame.EXIT_ON_CLOSE ao botão fechar, exiba a janela.
        janela.setSize(640, 480);
        janela.setTitle("Janela com paineis");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    } 
}
// 10. Execute a classe TestaJanelaComRolagem e observe o resultado.(SHIFT + F6)
// 11. Maximize a janela e observe o resultado.
