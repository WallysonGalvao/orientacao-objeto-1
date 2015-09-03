/* 
 * Escreva um programa Java que implemente o objeto Banco. (PARTE 02)
 */
package lista03.exercicio10;

//5. Crie uma classe ContaPoupanca que herda de ContaBancaria.
public class ContaPoupanca extends ContaBancaria {
	
	// 6. Dentro da classe, defina um construtor que inicialize os atributos número e titular.
	public ContaPoupanca(int numero, String titular) {
		super(numero, titular);
	}
	
	// 7. Defina o método atualizarRendimento que recebe o parâmetro taxa e sem retorno.
	public void atualizarRendimento(double taxa){
		// 8. Dentro do método calcule o rendimento da poupança multiplicando o saldo com a taxa e em seguida atualize o saldo.
		saldo += saldo * taxa;
	}
}
