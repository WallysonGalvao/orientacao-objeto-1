/*
 * Escreva um programa Java que trate eventos de janela.(PARTE 03)
 */
package lista07.exercicio02;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

// 12. Crie uma classe OuvinteEstadoJanela que implementa a interface WindowStateListener.
public class OuvinteEstadoJanela implements WindowStateListener {

    // 13. Defina todos os métodos especificados pela interface WindowStateListener.
    @Override
    public void windowStateChanged(WindowEvent we) {
        // 14. No método windowStateChanged imprima a mensagem "A janela passou de " + we.getOldState() + " para " + we.getNewState().
        System.out.println("A janela passou de " + we.getOldState() + " para " + we.getNewState());
    }
} 
