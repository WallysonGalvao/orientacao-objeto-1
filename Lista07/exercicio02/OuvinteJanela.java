/*
 * Escreva um programa Java que trate eventos de janela.(PARTE 01)
 */
package lista07.exercicio02;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 1. Crie uma classe OuvinteJanela que implementa a interface WindowListener.
public class OuvinteJanela implements WindowListener {
    /*
     * 2. Defina todos os métodos especificados pela interface WindowListener
     *    (Dica: pressionar Alt+Insert e selecionar Implementar método. Apague as linhas de código gerada em cada método). 
     */

    @Override
    public void windowOpened(WindowEvent we) {
        // 3. No método windowOpened imprima a mensagem "Janela aberta".
        System.out.println("Janela aberta");
    }

    @Override
    public void windowClosed(WindowEvent we) {
        // 4. No método windowClosed imprima a mensagem "Janela fechada".
        System.out.println("Janela fechada");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        // 5. No método windowClosing imprima a mensagem "Fechando a janela".
        System.out.println("Janela fechando");
    }

    @Override
    public void windowIconified(WindowEvent we) {
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
    }

    @Override
    public void windowActivated(WindowEvent we) {
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
    }
}
