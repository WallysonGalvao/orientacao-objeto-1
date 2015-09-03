/*
 * Escreva um programa que calcule o perímetro de uma circunferência.
 */
package Lista01;

// 1. Crie uma classe chamada PerimetroCircunferencia com um bloco main.
public class PerimetroCircunferencia {

    public static void main(String[] args) {
        // 2. Dentro do main, declare uma constante PI com o valor 3.1416.
        final double PI = 3.1416;

        // 3. Crie uma variável raio e inicialize-a com um valor.
        double raio = 60;

        // 4. Crie uma variável perimetro e inicialize-a com o resultado de 2*PI*raio.
        double perimetro = (2 * PI * raio);

        // 5. Imprima a variável perimetro.
        System.out.println("Perímetro: " + perimetro);
    }
}
// 6. Execute a classe e observe o resultado.(SHIFT + F6)