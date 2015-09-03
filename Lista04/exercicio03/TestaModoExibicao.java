/*
 * Escreva um programa Java que implemente os modos de exibição de uma janela.
 */
package lista04.exercicio03;

import javax.swing.JDialog;
import javax.swing.JFrame;

// 1. Crie uma classe TestaModoExibicao com o bloco main.
public class TestaModoExibicao extends CaixaDialogo {

    public static void main(String[] args) {
        // 2. Dentro do bloco, defina uma variável janelaPrincipal inicializando-a com uma instância de JFrame.
        JFrame janelaPrincipal = new JFrame();

        // 3. Defina o tamanho 640x480 fazendo uma chamada ao método setSize da variável janelaPrincipal.
        janelaPrincipal.setSize(640, 480);

        // 4. Faça o botão fechar da variável janelaPrincipal interromper a execução do programa.
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 5. Torne a janelaPrincipal visível.
        janelaPrincipal.setVisible(true);

        /* 
         * 6. Defina uma variável caixaDialogo inicializando-a com uma instância de JDialog não modal e filha da janelaPrincipal
         *    (Dica: chame o construtor new JDialog(janelaPrincipal, false);).
         */
        //JDialog caixaDialogo = new JDialog(janelaPrincipal, false);
        
        /*
         * 12. Altere a variável caixaDialogo como uma uma instância de JDialog modal e filha da janelaPrincipal
         *     (Dica: chame o construtor new JDialog(janelaPrincipal, true);). 
         */        
        JDialog caixaDialogo = new JDialog(janelaPrincipal, true);

        // 7. Defina o tamanho 320x240 para a variável caixaDialogo.
        caixaDialogo.setSize(320, 240);

        // 8. Faça o botão fechar da variável caixaDialogo interromper a execução do programa.
        caixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        // 9. Torne a caixa de diálogo visível.
        caixaDialogo.setVisible(true);

        // 11. Tente fechar a janelaPrincipal sem fechar a caixaDialogo.
        // 14. Tente fechar a janelaPrincipal sem fechar a caixaDialogo.
        // 15. Feche a caixaDialogo e verifique se o programa foi encerrado.        
    }
}
// 10. Execute a classe TestaModoExibicao e observe o resultado. (SHIFT + F6)

// 13. Execute a classe TestaModoExibicao e observe o resultado. (SHIFT + F6)
