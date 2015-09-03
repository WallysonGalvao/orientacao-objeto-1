/*
 * Escreva um programa Java que implemente os objetos Conta Corrente e Conta Poupança. (PARTE 02)
 */
package lista03.exercicio09;

// 9. Crie a classe TestaHerancaConta com um bloco main.
public class TestaHerancaConta {

    public static void main(String[] args) {
        /* 
         * 10. Dentro do main, crie as variáveis corrente e poupanca inicializando-as respectivamente com instância de ContaCorrente e ContaPoupanca
         *     (detalhe: a conta corrente deve ter um limite de 1000).
         */
        ContaCorrente corrente = new ContaCorrente(123456, "Fulano", 500);
        ContaPoupanca poupanca = new ContaPoupanca(654321, "Ciclano");

        /* 
         * 11. Chame os métodos depositar e sacar da variável corrente
         *     (por exemplo, depositar 100 e sacar 500) e imprima o saldo atual da conta.
         */
        corrente.depositar(500);
        corrente.sacar(200);
        System.out.println(corrente.getSaldo());

        /* 
         * 12. Chame os métodos depositar e atualizarRendimento da variável poupanca
         *     (por exemplo, depositar 200 e calcular 0,085) e imprima o salto atual da conta.
         */
        poupanca.depositar(500);
        poupanca.atualizarRendimento(0.085);
        System.out.println(poupanca.getSaldo());
    }
}
// 13. Execute a classe TestaHerancaConta e observe o resultado.
