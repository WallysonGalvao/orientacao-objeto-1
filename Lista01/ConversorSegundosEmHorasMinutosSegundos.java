/*
 * Escreva um programa que converta um número de segundos em horas, minutos e segundos.
 */
package Lista01;

// 1. Crie uma classe chamada ConversorSegundosEmHorasMinutosSegundos com um bloco main.
public class ConversorSegundosEmHorasMinutosSegundos {

    public static void main(String[] args) {
        // 2. Dentro do main, declare uma variável segundos e inicialize-a com um valor.
        int segundos = 201600;
        
        // 3. Crie uma variável horas e inicialize-a com a divisão da variável segundos por 3600.
        int horas = segundos / 3600;
        
        // 4. Atualize a variável segundos com o resto da divisão de segundos por 3600.
        segundos = segundos % 3600;
        
        // 5. Crie uma variável minutos e inicialize-a com a divisão da variável segundos por 60.
        int minutos = segundos / 60;
        
        // 6. Atualize a variável segundos com o resto da divisão de segundos por 60.
        segundos = segundos % 60;
        
        /* 7. Imprima as variáveis horas, minutos e segundos no formato HH:MM:SS 
         * (Dica: concatentar com ":" utilizando o operador +).
         */
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
// 8. Execute a classe e observe o resultado. (SHIFT + F6)
