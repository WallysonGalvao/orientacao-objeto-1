/*
 * Escreva um programa Java que cria um menu principal. (PARTE 01)
 */
package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

// 1. Crie uma classe Janela que estende de JFrame.
public class Janela extends JFrame {
    /* 
     * 2. Defina os atributos barraMenu do tipo JMenuBar, menuArquivo e menuAjuda do tipo JMenu,
     *    menuArquivoSair e menuAjudaSobre do tipo JMenuItem.
     */
    JMenuBar barraMenu;
    JMenu menuArquivo;
    JMenu menuAjuda;              
    JMenuItem menuArquivoSair;        
    JMenuItem menuAjudaSobre;
    
    // 3. Crie um construtor padrão para a janela.
    public Janela() {
        // 4. No construtor inicialize o atributo barraMenu com uma instância de JMenuBar.
        barraMenu = new JMenuBar();
        
        // 5. Também inicialize o atributo menuArquivo com uma instância de JMenu, cujo texto é Arquivo (Dica: new JMenu("Arquivo");).        
        menuArquivo = new JMenu("Arquivo");
        
        // 6. Defina a letra A como tecla de atalho para menuArquivo (Dica: setMnemonic('A');)
        menuArquivo.setMnemonic('A');
        
        // 7. Agora inicialize o atributo menuAjuda com uma instância de JMenu, cujo texto é Ajuda.        
        menuAjuda = new JMenu("Ajuda");
        
        // 8. Defina a letra j como tecla de atalho para menuAjuda.
        menuAjuda.setMnemonic('J');
        
        /*
         * 9. Ainda no construtor inicialize o atributo menuArquivoSair com uma instância de JMenuItem,
         *    cujo texto é Sair (Dica: new JMenuItem("Sair"));
         */
        menuArquivoSair = new JMenuItem("Sair");
        
        /*
         * 21. Defina uma classe anônima ActionListener para menuArquivoSair, cuja ação é de encerrar o programa
         *     (Dica: chame addActionListener( new ActionListener(){
         *                      public void actionPerformed(ActionEvent e) {
         *                          System.exit(0); } });
         *     abaixo da linha de inicialização da variável menuArquivoSair).
         */
        menuArquivoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // 10. Defina a letra r como tecla de atalho para menuArquivoSair.
        menuArquivoSair.setMnemonic('R');
        
        // 11. Inicialize o atributo menuAjudaSobre com uma instância de JMenuItem, cujo texto é Sobre... .
        menuAjudaSobre = new JMenuItem("Sobre...");

        // 22. Defina uma classe anônima ActionListener para menuAjudaSobre, cuja ação é de exibir uma caixa de mensagem Aplicação 1.0.
        menuAjudaSobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Aplicação 1.0.");
            }
        });
        
        // 12. Defina a letra S como tecla de atalho para menuAjudaSobre.
        menuAjudaSobre.setMnemonic('S');
        
        // 13. Adicione menuArquivoSair em menuArquivo e menuAjudaSobre em menuAjuda.
        menuArquivo.add(menuArquivoSair);
        menuAjuda.add(menuAjudaSobre);
        
        // 14. Adicione menuArquivo e menuAjuda em barraMenu.
        barraMenu.add(menuArquivo);
        barraMenu.add(menuAjuda);        
        
        // 15. Adicione barraMenu na janela (Dica: setJMenuBar(barraMenu);).
        setJMenuBar(barraMenu);
        
        // 16.Ainda no construtor, atribua o tamanho 640x480 e o valor JFrame.EXIT_ON_CLOSE ao botão fechar.
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }     
}