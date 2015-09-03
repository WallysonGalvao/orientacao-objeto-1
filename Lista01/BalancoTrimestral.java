/*
 * Escreva um programa que calcule e imprima o gasto no primeiro trimestre, 
 * sendo que em Janeiro foi gasto R$ 15.040,00, em Fevereiro R$ 23.004,70, 
 * e em Março R$ 17.010,04.
 */
package Lista01;
// 1. Crie uma classe chamada BalancoTrimestral com um bloco main.
public class BalancoTrimestral {
    /* 2. Dentro do main, declare as variáveis chamadas gastosJaneiro, 
     * gastosFevereiro e gastosMarco, inicializando-as com 15040.00, 
     * 23004.70 e 17010.04, respectivamente.
     */
    public static void main(String[] args) {
        double gastosJaneiro = 15040.00;
        double gastosFevereiro = 23004.70;
        double gastosMarco = 17010.04;
        
        /* 3. Crie uma variável gastosPrimeiroTrimestre e inicialize-a com 
         * a soma das outras três variáveis.
         */
        double gastosPrimeiroTrimestre = (gastosJaneiro + gastosFevereiro + gastosMarco);
        
        // 4. Imprima a variável gastosPrimeiroTrimestre utilizando a classe System.
        System.out.println("Soma: " + gastosPrimeiroTrimestre);
    }
}
// 5. Execute a classe e observe o resultado.
