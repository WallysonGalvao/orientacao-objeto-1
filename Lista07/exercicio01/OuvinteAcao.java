/*
 * Escreva um programa Java que trate eventos de ação. (PARTE 01)
 */
package lista07.exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 1. Crie uma classe OuvinteAcao que implementa a interface ActionLister.
public class OuvinteAcao implements ActionListener {
    /*
     * 2. Defina o método actionPerformed que recebe como parâmetro um evento ActionEvent
     *    (Dica: public void actionPerformed(ActionEvent e) { }).
     */

    public void actionPerformed(ActionEvent e) {
        // 3. No método actionPerformed imprima a mensagem "Uma ação foi executada".
        System.out.println("Uma ação foi executada.");
    }
}
