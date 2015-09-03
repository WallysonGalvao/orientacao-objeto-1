/* 
 * Escreva um programa Java que implemente o objeto Banco. (PARTE 03)
 */
package lista03.exercicio10;

// 11. Crie uma classe TestaBanco com um bloco main.
public class TestaBanco {
    public static void main(String[] args) {
        // 12. Dentro do main, declare uma variável banco e inicialize-a com uma instância de Banco.
        Banco banco = new Banco(3);
        
        // 13. Crie várias instâncias de Conta Corrente e de Conta Poupança e acrescente-as ao banco através do método adicionarConta().
        ContaPoupanca contaPoupanca = new ContaPoupanca(654321, "fulano");
        banco.adicionarConta(contaPoupanca);
        
        
        // 14. Chame o método calcularRendimentoPoupanca com a taxa de juros igual a 5%.
        banco.calcularRendimentoPoupanca(0.05);
        
        // 15. Imprima as contas do banco através do método exibirContas.
        banco.exibirContas();
    }
}
// 16. Execute a classe TestaBanco e observe o resultado.