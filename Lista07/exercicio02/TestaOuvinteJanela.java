/*
 * Escreva um programa Java que trate eventos de janela.(PARTE 02)
 */
package lista07.exercicio02;

import javax.swing.JFrame;

// 6. Crie uma classe TestaOuvinteJanela com um bloco main.
public class TestaOuvinteJanela {

    public static void main(String[] args) {

        // 7. Dentro do main, defina uma variável ouvinteJanela inicializando-a com uma instância de OuvinteJanela.
        OuvinteJanela ouvinteJanela = new OuvinteJanela();

        /*
         * 15. Na classe TestaOuvinteJanela, declare a variável ouvinteEstadoJanela
         *     (abaixo da variável ouvinteJanela) inicializando-a com uma instância de OuvinteEstadoJanela.
         */
        OuvinteEstadoJanela ouvinteEstadoJanela = new OuvinteEstadoJanela();

        // 8. Defina uma variável janela inicializando-a com uma instância de JFrame.
        JFrame janela = new JFrame();

        // 9. Adicione o ouvinteJanela à janela através do método addWindowListener.
        janela.addWindowListener(ouvinteJanela);

        // 16. Adicione o ouvinteEstadoJanela à janela através do método addWindowStateListener (abaixo de addWindowListener).
        janela.addWindowStateListener(ouvinteEstadoJanela);

        // 10. Atribua o tamanho 640x480, o valor JFrame.EXIT_ON_CLOSE ao botão fechar, exiba a janela.
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        // 11. Execute a classe TestaOuvinteJanela, dispare eventos de janela (maximizar, minimizar, restaurar, fechar) e observe o resultado.
    }
}
// 17. Execute novamente a classe TestaOuvinteJanela, dispare eventos de janela (maximizar, minimizar, restaurar, fechar) e observe o resultado.
