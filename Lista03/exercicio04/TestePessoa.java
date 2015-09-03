/*
 * Escreva um programa Java que implemente um objeto Pessoa. (PARTE 02)
 */
package lista03.exercicio04;

// 7. Crie uma classe TestaPessoa com um bloco main.
public class TestePessoa {

    public static void main(String[] args) {
        /* 
         * 8. Dentro do main, declare uma varíavel pessoa e inicialize-a com uma instância de Pessoa
         *    (Dica: chame o construtor passando um nome, e o sexo usando as constantes Pessoa.SEXO_FEMININO ou Pessoa.SEXO_MASCULINO).
         */
        Pessoa pessoa = new Pessoa("Fulano", Pessoa.SEXO_MASCULINO);

        // 9. Imprima o nome e o sexo da pessoa.
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sexo: " + pessoa.getSexo());
    }
}
// 10. Execute a classe TestaPessoa e observe o resultado.
