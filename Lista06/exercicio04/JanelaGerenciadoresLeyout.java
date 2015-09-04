/*
 * Escreva um programa Java que implementa uma janela contendo o seguinte layout.
                    +-------------------------------------[-][ ][X]-+
                    | Janela com Gerenciadores de Layout           |
                    +-----------------------------------------------+
                    |+---++---++---++---+                           |
                    ||   ||   ||   ||   |                           |
                    |+---++---++---++---+                           |
                    +-----------------------------------------------+
                    |            +---++---++---++---+               |
                    |            |   ||   ||   ||   |               |
                    |            +---++---++---++---+               |
                    +-----------------------------------------------+
                    |                           +---++---++---++---+|
                    |                           |   ||   ||   ||   ||
                    |                           +---++---++---++---+|
                    +-----------------------------------------------+
 */

package lista06.exercicio04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaGerenciadoresLeyout {

    public static void main(String[] args) {
        JPanel painel1 = new JPanel();
        JPanel painel1A = new JPanel();
        JPanel painel1B = new JPanel();
        JPanel painel1C = new JPanel();
        JPanel painel1D = new JPanel();

        painel1.add(painel1A, BorderLayout.NORTH);
        painel1.add(painel1B, BorderLayout.NORTH);
        painel1.add(painel1C, BorderLayout.NORTH);
        painel1.add(painel1D, BorderLayout.NORTH);

        painel1A.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        painel1B.setBorder(BorderFactory.createLineBorder(Color.RED));
        painel1C.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        painel1D.setBorder(BorderFactory.createLineBorder(Color.ORANGE));

        JPanel painel2 = new JPanel();
        JPanel painel2A = new JPanel();
        JPanel painel2B = new JPanel();
        JPanel painel2C = new JPanel();
        JPanel painel2D = new JPanel();

        painel2.add(painel2A, BorderLayout.CENTER);
        painel2.add(painel2B, BorderLayout.CENTER);
        painel2.add(painel2C, BorderLayout.CENTER);
        painel2.add(painel2D, BorderLayout.CENTER);

        painel2A.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        painel2B.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        painel2C.setBorder(BorderFactory.createLineBorder(Color.RED));
        painel2D.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        
        JPanel painel3 = new JPanel();
        JPanel painel3A = new JPanel();
        JPanel painel3B = new JPanel();
        JPanel painel3C = new JPanel();
        JPanel painel3D = new JPanel();

        painel3.add(painel3A, BorderLayout.EAST);
        painel3.add(painel3B, BorderLayout.EAST);
        painel3.add(painel3C, BorderLayout.EAST);
        painel3.add(painel3D, BorderLayout.EAST);

        painel3A.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        painel3B.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        painel3C.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        painel3D.setBorder(BorderFactory.createLineBorder(Color.RED));

        painel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JFrame janela = new JFrame();

        GridLayout layoutA = new GridLayout(3, 1);
        GridLayout layoutB = new GridLayout(1, 4);

        janela.setLayout(layoutA);
        painel1.setLayout(layoutB);
        painel2.setLayout(layoutB);
        painel3.setLayout(layoutB);

        janela.add(painel1);
        janela.add(painel2);
        janela.add(painel3);

        janela.setSize(640, 480);
        janela.setTitle("Janela com Gerenciadores de Layout");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
