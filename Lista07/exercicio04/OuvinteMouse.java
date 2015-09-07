/*
 * Escreva um programa Java que trate eventos de mouse.(PARTE 01)
 */
package lista07.exercicio04;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// 1. Crie uma classe OuvinteMouse que deve implementar a interface MouseListener. 
public class OuvinteMouse implements MouseListener {
    
    // 2. Defina todos os métodos especificados pela interface MouseListener.
    @Override
    public void mouseClicked(MouseEvent me) {
        // 3. No método mouseClicked imprima a mensagem "Você clicou o botão" + me.getButton() +  " " + me.getClickCount() + " vez(es).".
        System.out.println("Você clicou o botão" + me.getButton() + " " + me.getClickCount() + " vez(es).");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        // 4. No método mouseEntered imprima a mensagem "O ponteiro do mouse está sobre o componente".
        System.out.println("O ponteiro do mouse está sobre o componente");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        // 5. No método mouseExited imprima a mensagem "O ponteiro do mouse está fora do componente".
        System.out.println("O ponteiro do mouse está fora do componente");
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }
}
