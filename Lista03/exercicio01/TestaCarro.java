/*
 * Escreva um programa Java que modele um objeto Carro. (PARTE 02)
 */
package lista03.exercicio01;

// 8. Cria uma classe TestaCarro contendo um bloco main.
public class TestaCarro {

    public static void main(String[] args) {
        /* 
         * 9. Dentro do main, defina uma variável carro e inicialize-a com uma instância de Carro
         *    (Dica: chame o construtor padrão da classe new Carro()).
         */
        Carro carro = new Carro();

        /* 
         * 10. Atribua valores para os atributos de carro 
         *     (Dica: utilize ponto depois da variável carro para acessar cada atributo).
         */
        carro.marca = "FIAT";
        carro.ano = 2015;
        carro.valor = 35000.00;

        // 11. Imprima o valor do carro.
        System.out.printf("Valor: R$ %.2f", carro.valor);
        System.out.println();

        /* 
         * 12. Se o método carro.serPopular() for igual a true então imprima a mensagem "O carro é popular", 
         *     caso contrário imprima a mensagem "O carro não é popular".
         */
        if (carro.serPopular() == true) {
            System.out.println("O carro é popular.");
        } else {
            System.out.println("O carro não é popular.");
        }
        
        /* 
         * 13. Imprima o valor do carro no ano de 2020 
         *     (Dica: chame o método carro.calcularDepreciacao(param) passando como parâmetro o valor 2020).
         */
        System.out.printf("Valor: R$ %.2f", carro.calcularDepreciacao(2020));
        System.out.println();
    }
}
// 14. Execute a classe TestaCarro e observe o resultado.
