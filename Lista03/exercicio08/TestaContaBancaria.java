/* 
 * Escreva um programa Java que implemente o objeto Conta Bancária. (PARTE 02)
 */
package lista03.exercicio08;

// 9. Crie uma classe TestaContaBancaria contendo um bloco main.
public class TestaContaBancaria {

    public static void main(String[] args) {
        // 10. Dentro da classe, declare uma variável conta e inicialize-a com uma instância de Conta Bancária.
        ContaBancaria conta = new ContaBancaria(500.0);

        // 11. Imprima o valor da variável conta.
        System.out.println(conta);
    }
}
// 12. Execute a classe TestaContaBancaria e observe o resultado.
