/*
 * Escreva um programa Java que implemente os objetos Conta Corrente e Conta Poupança. (PARTE 01)
 */
package lista03.exercicio09;

// 1. Crie uma classe ContaCorrente que herda de ContaBancaria.
public class ContaCorrente extends ContaBancaria {

    // 2. Dentro da classe, defina o atributo privado limite (double).
    private double limite;

    // 3. Defina um construtor que inicialize os atributos número, titular e limite.
    public ContaCorrente(int numero, String titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    // 4. Sobrescreva o método getSaldo para retornar a soma do saldo com o limite.
    @Override
    public double getSaldo() {
        return super.getSaldo() + limite;
    }
}
