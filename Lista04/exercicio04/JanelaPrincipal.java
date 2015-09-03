/*
 * Escreva um programa Java que implemente uma aplicação GUI. (PARTE 02)
 */
package lista04.exercicio04;

import javax.swing.JFrame;

// 5. Crie uma classe JanelaPrincipal que herde de JFrame.
public class JanelaPrincipal extends JFrame{

    // 6. Dentro da classe, defina o atributo janelaSobre da classe JanelaSobre.
    JanelaSobre janelaSobre = new JanelaSobre(null, true);

    // 7. Dentro da classe, crie um construtor padrão que inicialize o atributo janelaSobre com uma instância modal.
    public JanelaPrincipal() {
        janelaSobre.setModal(true);
    }

    // 8. Dentro da classe, defina o método exibir sem parâmetro e sem retorno.
    public void exibir() {
        /* 
         * 9. Dentro do método, atribua o tamanho 640x480, o título "Aplicação GUI", o valor JFrame.EXIT_ON_CLOSE
         *    ao botão fechar, exiba a janela maximizada e chame o método exibir do atributo janelaSobre.  
         */
        janelaSobre.setSize(640, 480);
        janelaSobre.setTitle("Aplicação GUI");
        janelaSobre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaSobre.setVisible(true);
    }
}
