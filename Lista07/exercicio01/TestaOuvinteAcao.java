/*
 * Escreva um programa Java que trate eventos de ação. (PARTE 02)
 */
package lista07.exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 4. Crie uma classe TestaOuvinteAcao com um bloco main.
public class TestaOuvinteAcao {

    public static void main(String[] args) {
        // 5. Dentro do main, defina uma variável ouvinteAcao inicializando-a com uma instância de OuvinteAcao.
        OuvinteAcao ouvinteAcao = new OuvinteAcao();

        // 6. Defina uma variável botao inicializando-a com uma instância de JButton (Dica: new JButton("Ok");).
        JButton botao = new JButton("OK");

        // 7. Adicione o ouvinteAcao ao botao através do método addActionListener.
        botao.addActionListener(ouvinteAcao);

        // 8. Defina uma variável painel inicializando-a com uma instância de JPanel.
        JPanel painel = new JPanel();

        // 9. Adicione o botao ao painel.
        painel.add(botao);

        // 10. Defina uma variável janela inicializando-a com uma instância de JFrame.
        JFrame janela = new JFrame();

        // 11. Adicione o painel à janela.
        janela.add(painel);

        // 12. Atribua o tamanho 640x480, o valor JFrame.EXIT_ON_CLOSE ao botão fechar, exiba a janela.
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        // 13. Execute a classe TestaOuvinteAcao, dispare eventos de acao (pressionar botão) e observe o resultado. 

        /*
         * 14. Interrompa a execução e adicione um ouvinte anônimo ao botao
         *     (Dica: chamar botao.addActionListener(new ActionListener() { 
         *                       public void actionPerformed(ActionEvent e) { 
         *                          } 
         *                    }); após a linha botao.addActionListener(ouvinteAcao);).
         */
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 15. No método actionPerformed do ouvinte anônimo imprima a mensagem "Outra ação foi executada".
                System.out.println("Outra ação foi executada.");
            }
        });
    }
}
// 16. Execute novamente a classe TestaOuvinteAcao, pressione o botão e observe o resultado.
