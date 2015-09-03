/*
 * Escreva um programa Java que implemente uma janela principal.
 */
package lista04.exercicio01;
/*
 * 3. Importe a classe javax.swing.JFrame 
 *    (Dica: Pressione CTRL+SHIFT+I para fazer a importação).
 */

import javax.swing.JFrame;

// 1. Crie uma classe TestaJanelaPrincipal com o bloco main.
public class TestaJanelaPrincipal {

    public static void main(String[] args) {
        // 2. Dentro do bloco, defina uma variável janela inicializando-a com uma instância de JFrame.
        JFrame janela = new JFrame();

        // 4. Define o título "Janela Principal" fazendo uma chamada ao método setTitle da variável janela.
        janela.setTitle("Janela Principal");

        // 5. Defina o tamanho 640x480 fazendo uma chamada ao método setSize da variável janela.
        janela.setSize(640, 480);

        /* 
         * 7. Interrompa a execução da classe TestaJanela e acrescente a chamada ao método 
         *    setVisible da variável janela passando como parâmetro o valor true.
         */
        janela.setVisible(true);

	// 9. Feche a janela e verifique se o programa foi encerrado.
        
        /*
         * 10. Interrompa a execução da classe TestaJanela e acrescente uma chamada ao método
         *     setDefaultCloseOperation da variável janela passando como parâmetro a constante JFrame.EXIT_ON_CLOSE.
         */
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 12. Feche a janela e verifique se o programa foi encerrado.
        
        // 13. Acrescente uma chamada ao método setExtendedState da variável janela passando como parâmetro a constante JFrame.MAXIMIZED_BOTH.
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

}
// 6. Execute a classe TestaJanelaPrincipal e observe o resultado. (SHIFT + F6)

// 8. Execute a classe TestaJanelaPrincipal e observe o resultado. (SHIFT + F6)

// 11. Execute a classe TestaJanelaPrincipal e observe o resultado.(SHIFT + F6)

// 14. Execute a classe TestaJanelaPrincipal e observe o resultado.(SHIFT + F6)
