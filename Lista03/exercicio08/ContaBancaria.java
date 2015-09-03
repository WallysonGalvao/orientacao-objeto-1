
/* 
 * Escreva um programa Java que implemente o objeto Conta Bancária. (PARTE 01)
 */
package lista03.exercicio08;

// 1. Crie uma classe chamada ContaBancaria.
public class ContaBancaria {

    // 2. Dentro da classe, defina os atributos privados número (int), titular (String), saldo (double).
    private int numero;
    private String titular;
    private double saldo;

    // 3. Defina um construtor que inicialize os atributos número e titular.	
    public ContaBancaria(int numero, String titular) {;
        this.numero = numero;
        this.titular = titular;
    }

    /* 
     * 4. Sobrecarregue o construtor para que inicialize todos os atributos da conta bancária
     *    (Dica: Defina outro construtor com um parâmetro para cada atributo).
     */
    public ContaBancaria(int numero) {
        this.numero = numero;
    }

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    /* 
     * 5. Defina o método toString que retorne a string 
     *    "Conta{número="+ getNumero() + ", titular=" + getTitular() + ", saldo="  + getSaldo() + "}".
     */
    @Override
    public String toString() {
        return "Conta Bancária [Número = " + getNumero() + ", Titular = " + getTitular() + ", Saldo = " + getSaldo() + "]";
    }

    // 6. Defina os métodos getters para todos atributos de conta bancária.
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // 7. Defina os métodos depositar e sacar ambos recebendo um parâmetro valor e sem retorno.
    // 8. O método depositar incrementa o saldo com o valor enquanto o métodos sacar decrementa o saldo com o valor.
    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }
}
