/*
 * Escreva um programa Java que cria um formulário contendo botões de apertar, 
 * de rádio e caixas de verificação. (parte 01)
 */
package lista09.exercicio01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

// 1. Crie uma classe Formulario que estende de JFrame.
public class Formulario extends JFrame {
    
    // 17. Na classe formulário declare o atributo quantidadeCursos do tipo inteiro.
    int quantidadeCursos;
    
    /*
     * 2. Defina os atributos: botaoSalvar e botaoFechar do tipo JButton;
     *    checkCursoAds, checkCursoSegInf, checkCursoJogos e checkCursoRedes do tipo JCheckBox;
     *    e radioBolsaIntegral100, radioBolsaParcial75, radioBolsaParcial50,
     *    radioBolsaParcial25 e radioSemBolsa do tipo JRadioButton.
     */
    JButton botaoSalvar;
    JButton botaoFechar;
    JCheckBox checkCursoAds;
    JCheckBox checkCursoSegInf;
    JCheckBox checkCursoJogos;
    JCheckBox checkCursoRedes;
    JRadioButton radioBolsaIntegral100;
    JRadioButton radioBolsaParcial75;
    JRadioButton radioBolsaParcial50;
    JRadioButton radioBolsaParcial25;
    JRadioButton radioSemBolsa;
    
    // 3. Crie um construtor padrão para o formulário.
    public Formulario() {
        /*
         * 4. No construtor inicialize os atributos:
         *    botaoSalvar e botaoFechar com uma instância de JButton contendo 
         *    respectivamente o texto "Salvar" e "Fechar";
         *    o checkCursoAds, checkCursoSegInf, checkCursoJogos e checkCursoRedes 
         *    com uma instância de JCheckBox contento respectivamente o texto "Análise e Desenvolvimento de Sistemas", 
         *    "Segurança da Informação", "Jogos Digitais" e "Redes de Computadores";
         *    e radioBolsaIntegral100, radioBolsaParcial75, radioBolsaParcial50, radioBolsaParcial25
         *    e radioSemBolsa com uma instância de JRadioButton contento respectivamente o 
         *    texto "Integral 100%", "Parcial 75%", "Parcial 50%", "Parcial 25%" e "Sem Bolsa".
         */
        botaoSalvar = new JButton("Salvar");
        botaoFechar = new JButton("Fechar");
        checkCursoAds = new JCheckBox("Análise e Desenvolvimento de Sistemas");
        checkCursoSegInf = new JCheckBox("Segurança da Informação"); 
        checkCursoJogos = new JCheckBox("Jogos Digitais"); 
        checkCursoRedes = new JCheckBox("Redes de Computadores");
        radioBolsaIntegral100 = new JRadioButton("Integral 100%");
        radioBolsaParcial75 = new JRadioButton("Parcial 75%");
        radioBolsaParcial50 = new JRadioButton("Parcial 50%");
        radioBolsaParcial25 = new JRadioButton("Parcial 25%");
        radioSemBolsa = new JRadioButton("Sem Bolsa");
        
        /*
         * 5. Em seguida crie um rótulo com o texto "Selecione até duas opções de curso:"
         *    e outro rótulo com o texto "Deseja cursar com bolsa de estudo?". 
         */
        JLabel labelCursos = new JLabel("Selecione até duas opções de curso:");
        JLabel labelBolsa = new JLabel("Deseja cursar com bolsa de estudo?");
        
        /*
         * 6. Também no construtor crie um painel para adicionar os botões de apertar e outro
         *    painel com gerenciador de grid contendo 11 linhas e 1 coluna para adicionar os demais componentes. 
         */
        JPanel painelBotoes = new JPanel();
        JPanel painelCentral = new JPanel(new GridLayout(11, 1));
        
        /*
         * 7. Adicione ao painelBotoes os atributos botaoSalvar e botaoFechar.
         *    Adicione ao painelCentral os atributos labelCursos, checkCursoAds, checkCursoSegInf, checkCursoJogos,
         *    checkCursoRedes, labelBolsa, radioBolsaIntegral100, radioBolsaParcial75,
         *    radioBolsaParcial50, radioBolsaParcial25 e radioSemBolsa. 
         */        
        painelBotoes.add(botaoSalvar);
        painelBotoes.add(botaoFechar);
        painelCentral.add(labelCursos);
        painelCentral.add(labelBolsa);
        painelCentral.add(checkCursoAds);
        painelCentral.add(checkCursoSegInf);
        painelCentral.add(checkCursoJogos);
        painelCentral.add(checkCursoRedes);
        painelCentral.add(radioBolsaIntegral100);
        painelCentral.add(radioBolsaParcial75);
        painelCentral.add(radioBolsaParcial50);
        painelCentral.add(radioBolsaParcial25);
        painelCentral.add(radioSemBolsa);        
        
        // 8. Adicione ao formulario o painelBotoes na parte sul e o painelCentral no centro.
        add(painelBotoes, BorderLayout.SOUTH);
        add(painelCentral, BorderLayout.CENTER);
        
        // 9. Ainda no construtor, atribua o tamanho 640x480 e o valor JFrame.EXIT_ON_CLOSE ao botão [X] do formulario.
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /*
         * 13. No construtor da classe Formulario crie uma instância de ButtonGroup
         *     e adicione a ela os atributos radioBolsaIntegral100, radioBolsaParcial75, radioBolsaParcial50,
         *     radioBolsaParcial25 e radioSemBolsa.
         */
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioBolsaIntegral100);
        buttonGroup.add(radioBolsaParcial75);
        buttonGroup.add(radioBolsaParcial50);
        buttonGroup.add(radioBolsaParcial25);
        buttonGroup.add(radioSemBolsa);
        
        // 14. Torne o atributo radioSemBolsa marcado (Dica: chamar setSelected(true);).
        radioSemBolsa.setSelected(true);
        
        /*
         * 16. Agora crie no construtor do formulario um ouvinte anônimo do tipo ActionListener
         *     para tratar a seleção de até dois cursos no formulário. (Dica: crie uma variavel ouvinte do tipo
         *     ActionListener inicializando com uma classe anonima e adicione
         *     esse ouvinte aos componentes JChekBox do formulário).
         */
        ActionListener ouvinte = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                 * 18. No método actionPerformed declare uma variavel checkBox inicializando com a chamada (JCheckBox) e.getSource().
                 *     Em seguida, verifique se checkBox foi selecionado incrementando o atributo quantidadeCursos em caso de afirmativo.
                 *     Caso contrário decremente o atributo quantidadeCursos.
                 *     Se a quantidade de cursos foi maior que 2 desmarque o checkBox e imprima a caixa de mensagem de alerta
                 *     "Atenção! Só é permitido a escolhe de até 2 cursos.
                 */
                JCheckBox checkBox = (JCheckBox) e.getSource();
                if (checkBox.isSelected()){
                    quantidadeCursos++;
                } else {
                    quantidadeCursos--;
                }
                
                if(quantidadeCursos > 2){
                    quantidadeCursos--;
                    checkBox.setSelected(false);
                    JOptionPane.showMessageDialog(null, "Atenção! Só é permitido a escolhe de até 2 cursos.", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            }
        };
        checkCursoAds.addActionListener(ouvinte);
        checkCursoSegInf.addActionListener(ouvinte);
        checkCursoRedes.addActionListener(ouvinte);
        checkCursoJogos.addActionListener(ouvinte);
        
        /*
         * 19. No construtor do formulário crie outro ouvinte anônimo do tipo ActionListener
         *     agora para o atributo botaoFechar que deve disparar o método dispose do formulário.  
         */
        botaoFechar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
            }
        });
    }   
}
