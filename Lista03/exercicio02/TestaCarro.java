/*
 * Escreva um programa Java que modele um objeto Carro. (PARTE 02)
 */
package lista03.exercicio02;

public class TestaCarro {

    public static void main(String[] args) {
        Carro carro = new Carro();

        /* 
         * 11. Altere na classe TestaCarro as chamadas de atualização dos atributos pelos métodos setters
         *     (Ex.: carro.marca = "" por carro.setMarca("")).
         */
        carro.setMarca("FIAT");
        carro.setAno(2015);
        carro.setValor(35000.00);

        /* 
         * 12. Altere na classe TestaCarro as chamadas de impressão dos atributos pelos métodos getters
         *    (Ex.: carro.marca por carro.getMarca()). 
         */
        System.out.printf("Valor: R$ %.2f", carro.getValor());
        System.out.println();

        if (carro.serPopular() == true) {
            System.out.println("O carro é popular.");
        } else {
            System.out.println("O carro não é popular.");
        }

        System.out.printf("Valor: R$ %.2f", carro.calcularDepreciacao(2020));
        System.out.println();
    }
}
// 13. Execute novamente a classe TestaCarro e observe o resultado.
