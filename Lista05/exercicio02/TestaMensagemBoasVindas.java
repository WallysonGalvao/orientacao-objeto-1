/*
 * Escreva um programa Java que implemente uma mensagem de boas vindas.
 */
package lista05.exercicio02;

// 1. Crie uma classe TestaMensagemBoasVindas com um bloco main.
import javax.swing.JOptionPane;

public class TestaMensagemBoasVindas {

    public static void main(String[] args) {
        // 2.  Dentro do bloco, crie uma uma mensagem de confirmação "Deseja iniciar o programa?".
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja iniciar o programa?", "Confirmação", JOptionPane.YES_NO_OPTION);

        // 3. Se a resposta for "Sim", crie uma mensagem de entrada "Informe seu nome".
        if (opcao == JOptionPane.YES_NO_OPTION) {
            String nome = JOptionPane.showInputDialog(null, "Informe um valor");
            // 4. Se um nome foi informado, crie uma mensagem de aviso "Bem-vindo <nome>!".
            if (!nome.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Bem-vindo " + nome + "!");
                // 5. Se não informou um nome, crie uma mensagem de erro "Nome não informado!".
            } else {
                JOptionPane.showMessageDialog(null, "Nome não informado!");
            }
            // 6. Se a resposta for "Não", crie uma mensagem de alerta "O programa foi encerrado.".    
        } else {
            JOptionPane.showMessageDialog(null, "O programa foi encerrado.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }
}
// 7. Execute a classe TestaMensagemBoasVindas e observe o resultado. (SHIFT + F6)
