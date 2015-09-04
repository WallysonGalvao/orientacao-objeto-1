/*
 * Escreva um programa Java que implementa uma caixa de mensagem customizada.
 */
package lista05.exercicio03;

// 1. Crie uma classe TestaCaixaMensagemCustomizada com um bloco main.
import javax.swing.JOptionPane;

public class TestaCaixaMensagemCustomizada {

    public static void main(String[] args) {
        // 2. Dentro do bloco, declare uma variável opcoes do tipo Object[] inicializando-a como o array {"Java", ".Net", "Php"};
        Object[] linguagens = {"Java", ".Net", "Php"};

        // 3. Declare também uma variável opcao do tipo inteiro.
        /* 
         * 4. Crie uma caixa de mensagem customizada contendo o título "Enquete", o texto "Qual a linguagem de programção que você prefere trabalhar?",
         *    o ícone QUESTION_MESSAGE e os botões YES_NO_CANCEL_OPTION, cujos os títulos foram definidos pela varíavel opcoes
         *    (Dica: chamar o método JOptionPane.showOptionDialog).
         */
        // 5. Atribua a resposta da caixa de mensagem a variável opcao.
        int opcao = JOptionPane.showOptionDialog(null,
                "Qual a linguagem de programção que você prefere trabalhar?",
                "Enquete",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                linguagens,
                linguagens[0]);

        // 6. Exiba uma mensagem informado a opção escolhida pelo usuário.
        JOptionPane.showMessageDialog(null, "Opção escolhida: " + linguagens[opcao] + "!");
    }
}
// 7. Execute a classe TestaCaixaMensagemCustomizada e observe o resultado.(SHIFT + F6)
