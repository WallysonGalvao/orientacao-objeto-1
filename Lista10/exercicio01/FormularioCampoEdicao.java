/*
 * Faça um programa Java onde tudo o que for preenchido em um campo de texto
 * seja adicionado à área de texto assim que pressionar um botão. (PARTE 01) 
 */
package lista10.exercicio01;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// 1. Crie uma classe FormularioCampoEdicao que estende de JFrame.
public class FormularioCampoEdicao extends JFrame {
    /*
     * 2. Defina os atributos: botaoAdicionar do tipo JButton;
     *    campoTexto do tipo JTextField; areaTexto do tipo JTextArea. 
     */    
    JButton botaoAdicionar;
    JTextField campoTexto;
    JTextArea areaTexto;
    
    // 3. Crie um construtor padrão para FormularioCampoEdicao.
    public FormularioCampoEdicao() {
        /*
         * 4. No construtor inicialize os atributos:
         *    botaoAdicionar com uma instância de JButton contendo o texto "Adicionar";
         *    o campoTexto com uma instância de JTextField contendo o tamanho 20;
         *    e areaTexto com uma instância de JTextArea contendo 20 colunas e 5 linhas.
         */
        botaoAdicionar = new JButton("Adicionar");
        campoTexto = new JTextField(20);
        areaTexto = new JTextArea(5, 20);
        
        // 5. Em seguida crie um rotulo contendo o texto "Digite um texto:".
        JLabel label = new JLabel("Digite um texto:");
        
        /*
         * 6. Também no construtor crie um painel para adicionar o botão de apertar
         *    e outro painel com gerenciador de grid contendo 5 linhas e 1 coluna
         *    para adicionar os demais componentes.
         */
        JPanel painelBotao = new JPanel();
        JPanel painelCentral = new JPanel(new GridLayout(5, 1));
        
        /*
         * 7. Adicione ao painel de botões o atributo botaoAdicionar.
         *    Adicione ao painel principal os demais atributos nessa ordem:
         *    rótulo, campo de texto e área de texto. 
         */
        painelBotao.add(botaoAdicionar);
        painelCentral.add(label);
        painelCentral.add(campoTexto);
        
        
        /*
         * 8. Adicione a classe FormularioCampoEdicao o painel de botões
         *    na parte sul e o painel principal no centro. 
         */
        add(painelBotao, BorderLayout.SOUTH);
        add(painelCentral, BorderLayout.CENTER);
        
        /*
         * 9. Ainda no construtor, atribua o tamanho
         *    640x480 e o valor JFrame.EXIT_ON_CLOSE ao botão [X] da classe FormularioCampoEdicao.
         */
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        /*
         * 13. No construtor da classe FormularioCampoEdicao crie uma variável painelRolagem
         *     inicializando-a com instância de JScrollPane,
         *     adicionando a ela o atributo areaTexto.
         *     Substitua a linha onde areaTexto é adicionada ao painel principal pela variável painelRolagem.
         */
        JScrollPane painelRolagem = new JScrollPane(areaTexto);        
        painelCentral.add(painelRolagem);
        
        /*
         * 14. Torne o atributo areaTexto não editável e faça quebrar a linha automáticamente
         *     (Dica: chamar os métodos setEditable, setLineWrap e setWrapStyleWord.
         */
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        
        /*
         * 16. Agora crie no construtor do formulario um ouvinte anônimo do tipo ActionListener
         *     para tratar a ação de pressionar o botaoAdicionar.
         *     (Dica: crie uma variavel ouvinte do tipo ActionListener inicializando
         *     com uma classe anonima e adicione esse ouvinte ao componente JButton do formulário).
         */
        botaoAdicionar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                 * 17. No método actionPerformed faça o conteúdo do campoTexto ser adicionar a areaTexto
                 *     (Dica: chamar método append de areaTexto recebendo o método getText de campoTexto).
                 *     Em seguda, limpar o conteúdo do campoTexto (Dica: chamar método setText).
                 */
                areaTexto.append(campoTexto.getText());
                campoTexto.setText("");
            }
        });
        
    }         
}