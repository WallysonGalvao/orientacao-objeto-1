/*
 * Faça um programa Java para selecionar uma UF e um municipio utilizando campos de seleção.(PARTE 01)
 */
package lista11.exercicio01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

// 1. Crie uma classe FormularioCampoSelecao que estende de JFrame.
public class FormularioCampoSelecao extends JFrame {
    /*
     * 2. Defina os atributos: comboUF do tipo JComboBox;
     *    listaMunicipio do tipo JList; arrayUF do tipo String[]
     *    e arrayMunicipio do tipo String[][].
     */
    JComboBox comboUF;
    JList listaMunicipio;
    String[] arrayUF;
    String[][] arrayMunicipio;
    
    // 3. Crie um construtor padrão para FormularioCampoSelecao.
    public FormularioCampoSelecao() {
        /*
         * 4. No construtor inicialize os atributos: arrayUF com new String[] {"DF","GO"};
         *    arrayMunicipio com new String[][] {{"Brasília", "Taguatinga", "Sobradinho"},
         *    {"Formosa", "Planaltina", "Valparaiso"}};
         *    comboUF com uma instância de JComboBox contendo o arrayUF;
         *    e listaMunicipio com uma instância de JList contendo arrayMunicipio[0].
         */
        arrayUF = new String[] {"DF","GO"};
        arrayMunicipio = new String[][] {{"Brasília", "Taguatinga", "Sobradinho"},
                                         {"Formosa", "Planaltina", "Valparaiso"}};
        comboUF = new JComboBox(arrayUF);
        listaMunicipio = new JList(arrayMunicipio[0]);
        
        /*
         * 13. Faça o atributo listaMunicipio selecionar um item apenas
         *     (Dica: usar o método setSelectionMode(ListSelectionModel.SINGLE_SELECTION));
         */  
        listaMunicipio.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // 5. Em seguida crie um rótulo contendo o texto "Seleciona a UF:" e outro contendo o texto "Selecione o Município".        
        JLabel labelUF = new JLabel("Seleciona a UF:");
        JLabel labelMunicipio = new JLabel("Selecione o Município");
        
        // 6. Também no construtor crie um painel para adicionar os demais componentes.
        JPanel painelCentral = new JPanel();
        
        // 7. Adicione ao painel principal os atributos nessa ordem: rótulo, combo, rótulo e lista. 
        painelCentral.add(labelUF);
        painelCentral.add(comboUF);
        painelCentral.add(labelMunicipio);
        painelCentral.add(listaMunicipio);
        
        // 8. Adicione a classe FormularioCampoSelecao o painel principal no centro. 
        add(painelCentral, BorderLayout.CENTER);
        
        /*
         * 9. Ainda no construtor, atribua o tamanho
         *    640x480 e o valor JFrame.EXIT_ON_CLOSE ao botão [X] da classe FormularioCampoEdicao.
         */
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        /*
         * 14. Agora crie no construtor do formulario um ouvinte anônimo do tipo ActionListener
         *     para tratar a ação de pressionar o botaoAdicionar.
         *     (Dica: crie uma variavel ouvinte do tipo ActionListener inicializando
         *     com uma classe anonima e adicione esse ouvinte ao componente JCombox da classe FormularioCampoSelecao).
         */
        comboUF.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                 * 15. No método actionPerformed(ActionEvent e) faça o conteúdo de listaMunicipio
                 *     receber o valor de arrayMunicipio[i] onde i é o índice do item selecionado na combo.
                 *     (Dica: declarar uma variavel combo e inicializar com (JComboBox) e.getSource.
                 *     Chamar o método getSelectedIndex para obter o índice).
                 */
                JComboBox combo = (JComboBox) e.getSource();
                listaMunicipio.setListData(arrayMunicipio[combo.getSelectedIndex()]);            
            }
        });
    }    
}