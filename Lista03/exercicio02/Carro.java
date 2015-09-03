/*
 * Escreva um programa Java que modele um objeto Carro. (PARTE 01)
 */
package lista03.exercicio02;

public class Carro {

    /* 
     * 1. Torne os atributos da classe Carro privados 
     *    (Dica: acrescentar a cláusula private na declaração das variáveis).
     */
    private String marca;
    private int ano;
    private double valor;

    // 2. Defina o método getMarca que não recebe parâmetro algum e retorna a marca do carro.
    public String getMarca() {
        return marca;
    }

    // 3. Defina o método setMarca que recebe como parâmetro uma string marca e não retorna valor algum (void). 
    public void setMarca(String marca) {
        /* 
         * 4. Dentro do método, atualize o atributo marca com o parâmetro marca
         *    (Dica: utilize this para acessar o atributo marca).
         */
        this.marca = marca;
    }

    // 5. Defina o método getAno que não recebe parâmetro algum e retorna o ano do carro.
    public int getAno() {
        return ano;
    }

    // 6. Defina o método setAno que recebe como parâmetro um ano e não retorna valor algum (void).
    public void setAno(int ano) {
        // 7. Dentro do método atualize o atributo ano com o parâmetro ano.
        this.ano = ano;
    }

    // 8. Defina o método getValor que não recebe parâmetro algum e retorna o valor do carro.
    public double getValor() {
        return valor;
    }

    // 9.  Defina o método setValor que recebe como parâmetro um valor e não retorna valor algum (void). 
    public void setValor(double valor) {
        // 10. Dentro do método atualize o atributo valor com o parâmetro valor.
        this.valor = valor;
    }

    public boolean serPopular() {
        return valor < 25000.00;
    }

    public double calcularDepreciacao(int ano) {
        double valorDepreciado = ano - (this.ano * 0.01);
        return valorDepreciado;
    }
}
