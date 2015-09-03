package lista03.exercicio10;

public class ContaBancaria {
	private int numero;
	private String titular;
	public double saldo;
			
	public ContaBancaria(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}	
	
	public ContaBancaria(int numero) {
		this.numero = numero;
	}

	public ContaBancaria(String titular) {
		this.titular = titular;
	}

	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}	
	
	@Override
	public String toString() {
		return "Conta Bancária [Número = " + getNumero() + ", Titular = " + getTitular() + ", Saldo = " + getSaldo() + "]";
	}
	
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
	
	public void depositar(double valor){		
		saldo += valor;
	}
	
	public void sacar(double valor){
		saldo -= valor;
	}	
}
