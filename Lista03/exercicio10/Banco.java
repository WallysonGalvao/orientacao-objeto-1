/* 
 * Escreva um programa Java que implemente o objeto Banco. (PARTE 01)
 */
package lista03.exercicio10;

// 1. Crie uma classe chamada Banco.
public class Banco {

    // 2. Dentro da classe, defina o atributo contasArray (ContaBancaria[]).
    ContaBancaria[] contasArray;

    // 3. Defina um construtor que inicialize o atributo contasArray com um tamanho passado como parâmetro.	
    public Banco(int tamanho) {
        contasArray = new ContaBancaria[tamanho];
    }

    // 4. Defina também o atributo totalContas inicializando com ZERO.
    int totalContas = 0;

    // 5. Defina um método adicionarConta que recebe como parâmetro uma instância de Conta Bancária e sem retoro.
    public void adicionarConta(ContaBancaria contaBancaria) {
        // 6. Dentro do método, armazene na última posição do atributo contasArray e incremente o atributo totalContas.
        for (int i = 0; i < contasArray.length; i++) {
            contasArray[i] = contaBancaria;
        }
        totalContas++;
    }

    // 6. Defina um método calcularRendimentoPoupanca que recebe um parâmentro taxa e sem retorno.
    public void calcularRendimentoPoupanca(double taxa) {
        // 7. Dentro do método, crie um laço que percorra as posições preenchidas do atributo contasArray.
        for (int i = 0; i < contasArray.length; i++) {
            /* 
             * 8. Dentro do laço, verifique se contasArray é uma Conta Poupança para chamar o método atualizarRendimento
             *    (Dica: utilize contasArray[i] instanceof ContaPoupanca para identicar as contas poupança).
             */
            if (contasArray[i] instanceof ContaPoupanca) {
                
            }
        }        
    }
    
    // 9. Defina um método exibirContas sem parâmetro e sem retorno.
    public void exibirContas(){
        // 10. Dentro do método, crie um laço que percorra as posições preenchidas do atributo contasArray e imprima cada conta bancaria.
        for (ContaBancaria contasArray1 : contasArray) {
            System.out.println(contasArray1);
        }
    }
}
