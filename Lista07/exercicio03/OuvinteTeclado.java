/*
 * Escreva um programa Java que trate eventos de teclado.(PARTE 01)
 */
package lista07.exercicio03;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// 1. Crie uma classe OuvinteTeclado que deve implementar a interface KeyListener.
public class OuvinteTeclado implements KeyListener {
    // 2. Defina todos os métodos especificados pela interface KeyListener.
    @Override
    public void keyPressed(KeyEvent ke) {
        // 3. No método keyPressed imprima a mensagem "Pressionou a tecla " + ke.getKeyChar().
        System.out.println("Pressionou a tecla " + ke.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        // 4. No método keyReleased imprima a mensagem "Liberou a tecla " + ke.getKeyChar().
        System.out.println("Liberou a tecla " + ke.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        // 5. No método keyTyped imprima a mensagem "Digitou a tecla " + ke.getKeyChar().
        System.out.println("Digitou a tecla " + ke.getKeyChar());
    }
}