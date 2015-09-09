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
      
        // Primeiro Painel
        JPanel painel1 = new JPanel();
        JPanel painel1A = new JPanel();
        JPanel painel1B = new JPanel();
        JPanel painel1C = new JPanel();
        JPanel painel1D = new JPanel();         

        // Paineis que ficam dentro do primeiro painel
        painel1.add(painel1A);
        painel1.add(painel1B);
        painel1.add(painel1C);
        painel1.add(painel1D);
        
        // Tamanho dos paineis de dentro
        painel1A.setPreferredSize(new Dimension(100, 100));
        painel1B.setPreferredSize(new Dimension(100, 100));
        painel1C.setPreferredSize(new Dimension(100, 100));
        painel1D.setPreferredSize(new Dimension(100, 100));

        // Cores do primeiro painel
        painel1A.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        painel1B.setBorder(BorderFactory.createLineBorder(Color.RED));
        painel1C.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        painel1D.setBorder(BorderFactory.createLineBorder(Color.ORANGE));

        // Segundo Painel
        JPanel painel2 = new JPanel();
        JPanel painel2A = new JPanel();
        JPanel painel2B = new JPanel();
        JPanel painel2C = new JPanel();
        JPanel painel2D = new JPanel();

        // Paineis que ficam dentro do segundo painel
        painel2.add(painel2A);
        painel2.add(painel2B);
        painel2.add(painel2C);
        painel2.add(painel2D);
        
        // Tamanho dos paineis de dentro
        painel2A.setPreferredSize(new Dimension(100, 100));
        painel2B.setPreferredSize(new Dimension(100, 100));
        painel2C.setPreferredSize(new Dimension(100, 100));
        painel2D.setPreferredSize(new Dimension(100, 100));

        // Cores do segundo painel
        painel2A.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        painel2B.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        painel2C.setBorder(BorderFactory.createLineBorder(Color.RED));
        painel2D.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        // Terceiro Painel
        JPanel painel3 = new JPanel();
        JPanel painel3A = new JPanel();
        JPanel painel3B = new JPanel();
        JPanel painel3C = new JPanel();
        JPanel painel3D = new JPanel();

        // Paineis que ficam dentro do terceiro painel
        painel3.add(painel3A);
        painel3.add(painel3B);
        painel3.add(painel3C);
        painel3.add(painel3D);
        
        // Tamanho dos paineis de dentro
        painel3A.setPreferredSize(new Dimension(100, 100));
        painel3B.setPreferredSize(new Dimension(100, 100));
        painel3C.setPreferredSize(new Dimension(100, 100));
        painel3D.setPreferredSize(new Dimension(100, 100));

        // Cores do terceiro painel
        painel3A.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        painel3B.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        painel3C.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        painel3D.setBorder(BorderFactory.createLineBorder(Color.RED));

        // Cores dos paineis principais
        painel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JFrame janela = new JFrame();

        GridLayout layoutA = new GridLayout(3, 1);

        janela.setLayout(layoutA);
        
        // Orientação dos paineis de dentro
        FlowLayout leiauteA = new FlowLayout(FlowLayout.LEFT);
        painel1.setLayout(leiauteA);
        FlowLayout leiauteB = new FlowLayout(FlowLayout.RIGHT);
        painel3.setLayout(leiauteB);

        janela.add(painel1);
        janela.add(painel2);
        janela.add(painel3);

        janela.setSize(640, 480);
        janela.setTitle("Janela com Gerenciadores de Layout");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
