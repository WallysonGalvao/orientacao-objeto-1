/*
 * Escreva um programa Java que implemente uma aplicação GUI. (PARTE 01)
 */
package lista04.exercicio04;

import javax.swing.JFrame;
import javax.swing.JDialog;

// 1. Crie uma classe JanelaSobre que herde de JDialog.
public class JanelaSobre extends JDialog {

    JDialog janela = new JDialog();
    /* 
     * 2. Defina um construtor que recebe como parâmetros owner do tipo JFrame e modal do tipo boolean.
     *    (Dica: Sobrescreva o construtor da classe pai passando esses mesmos parâmetros)
     */
    public JanelaSobre(JFrame owner, boolean modal) {
        super(owner, modal);
    }

    // 3. Defina o método exibir sem parâmetro e sem retorno.
    public void exibir() {
        // 4. Dentro do método, atribua o tamanho 320x240 e o título "Sobre..." para a janela, e exibir a janela centralizada.
        janela.setSize(320, 240);
        janela.setTitle("Sobre...");
        janela.setLocationRelativeTo(null);
    }

}
