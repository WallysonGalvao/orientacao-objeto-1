/*
 * Escreva um programa Java que modele um objeto Carro. (PARTE 01)
 */
package lista03.exercicio01;

// 1. Crie uma classe chamada Carro.
public class Carro {

    /* 
     * 2. Dentro da classe, defina os atributos marca (String), ano (int) e valor (double) 
     *    (Dica: declare uma variável para cada atributo).
     */
    public String marca = "GOL";
    public int ano = 2005;
    public double valor = 30000.00;

    /* 
     * 3. Defina o método serPopular que não recebe parâmetro algum e retorna um lógico (boolean) 
     *    (Dica: sintaxe de declaração do método é <tipo_do_retorno> <nome_do_metodo>(<tipo_do_param> param){}).
     */
    public boolean serPopular() {
        // 4. Dentro do método, verifique se o atributo valor é menor do que R$ 25.000,00 então retorne true, senão retorne false.        
        return valor < 25000.00;
    }

    // 5. Defina o método calcularDepreciacao que recebe como parâmetro um ano (int) e retorna o valor depreciado do carro (double).
    public double calcularDepreciacao(int ano) {
        /* 
         * 6. Dentro do método, declare a variável valorDepreciado (double) e inicializando-a com a subtração do parâmetro ano do atributo ano multiplicado com a taxa 1% 
         *    (Dica: utilize this.ano para acessar o atributo ano do carro).
         */
        double valorDepreciado = ano - (this.ano * 0.01);

        // 7. Ainda no método, retorne a subtração do atributo valor com a variável valorDepreciado.
        return valorDepreciado;
    }
}
