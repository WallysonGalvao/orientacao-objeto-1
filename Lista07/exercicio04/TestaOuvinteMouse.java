/*
 * Escreva um programa Java que trate eventos de mouse.(PARTE 02)
 */
package lista07.exercicio04;

import javax.swing.JFrame;

// 6. Crie uma classe TestaOuvinteMouse com um bloco main.
public class TestaOuvinteMouse {

    public static void main(String[] args) {
        // 7. Dentro do main, defina uma variável ouvinte inicializando-a com uma instância de OuvinteMouse.
        OuvinteMouse ouvinte = new OuvinteMouse();

        // 8. Defina uma variável janela inicializando-a com uma instância de JFrame.
        JFrame janela = new JFrame();

        // 9. Adicione o ouvinte à janela através do método addMouseListener.
        janela.addMouseListener(ouvinte);

        // 10. Atribua o tamanho 640x480, o valor JFrame.EXIT_ON_CLOSE ao botão fechar, exiba a janela.
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
// 11. Execute a classe TestaOuvinteJanela, dispare eventos de mouse e observe o resultado. 
