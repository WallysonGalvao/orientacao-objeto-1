/*
 * Escreva um programa Java que implemente algumas caixas de mensagem.
 */
package lista05.exercicio01;

// 1. Crie uma classe TestaJOptionPane com um bloco main.
import javax.swing.JOptionPane;

public class TestaJOptionPane {

    public static void main(String[] args) {
        /* 
         * 2. Crie uma caixa de mensagem para solicitar um valor ao usuário atribuindo o resultado na variável valor
         *    (Dica: chamar método JOptionPane.showInputDialog(null, "Informe uma valor");).
         */
        String valor = JOptionPane.showInputDialog(null, "Informe um valor");

        /*
         * 3. Exiba o conteúdo da variável valor em uma caixa de mensagem
         *    (Dica: chamar método JOptionPane.showMessageDialog(null, "O valor informado foi " + valor);).
         */
        JOptionPane.showMessageDialog(null, "O valor informado foi " + valor);

        /* 
         * 4. Crie uma caixa de mensagem para solicitar uma confirmação ao usuário atribuindo a reposta na variável opcao
         *    (Dica: chamar método JOptionPane.showInputDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);).
         */
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);

        /*
         * 5. Exiba o conteúdo da variável opcao em uma caixa de mensagem
         * (Dica: chamar método JOptionPane.showMessageDialog(null, "A opção escolhida foi " + opcao);).        
         */
        JOptionPane.showMessageDialog(null, "A opção escolhida foi " + opcao);

        /*
         * 6. Crie uma caixa de mensagem para informar o usuário sobre uma manutenção no sistema
         *    (Dica: chamar método JOptionPane.showMessageDialog(null, "O sistema estará em manutenção das 23hs a 04hs", "Aviso", JOptionPane.INFORMATION_MESSAGE);).
         */
        JOptionPane.showMessageDialog(null, "O sistema estará em manutenção das 23hs a 04hs", "Aviso", JOptionPane.INFORMATION_MESSAGE);

        /* 
         * 7. Crie uma caixa de mensagem para alertar o usuário que faltou preencher um campo
         *    (Dica: chamar método JOptionPane.showMessageDialog(null, "Atenção! Faltou preencher um campo obrigatório.", "Alerta", JOptionPane.WARNING_MESSAGE);).
         */
        JOptionPane.showMessageDialog(null, "Atenção! Faltou preencher um campo obrigatório.", "Alerta", JOptionPane.WARNING_MESSAGE);

        /* 
         * 8. Crie uma caixa de mensagem para comunicar uma falha na operação do sistema
         *    (Dica: chamar o método JOptionPane.showMessageDialog(null, "Falha na operação! Contate o gestor.", "Erro", JOptionPane.ERROR_MESSAGE);).
         */
        JOptionPane.showMessageDialog(null, "Falha na operação! Contate o gestor.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
// 9. Execute a classe TestaJOptionPane e observe o resultado. (SHIFT + F6)
