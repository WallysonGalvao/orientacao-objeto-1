/*
 * Escreva um programa Java que implemente um objeto Pessoa. (PARTE 01)
 */
package lista03.exercicio04;

// 1. Crie uma classe chamada Pessoa.
public class Pessoa {
    /* 
     * 2. Dentro da classe, defina as constantes públicas estáticas SEXO_MASCULINO e SEXO_FEMININO, 
     *    inicializando-as com os valores 1 e 2 respectivamente
     *    (Dica: utilize as cláusulas public static final).
     */
    public static final int SEXO_MASCULINO = 1;
    public static final int SEXO_FEMININO = 2;

    // 3. Defina os atributos privados nome e sexo.
    private String nome;
    private int sexo;

    /* 
     * 4. Defina um construtor que recebe como parâmetros o nome e o sexo de uma pessoa
     *    (Dica: sintaxe para declarar o construtor <nome_da_classe>(<tipo_do_param> param){}).
     */
    public Pessoa(String nome, int sexo) {
        // 5. Dentro do construtor atualize o atributo nome com o parâmetro nome e o atributo sexo com o parâmetro sexo.
        this.nome = nome;
        this.sexo = sexo;
    }

    // 6. Defina somente os métodos getters para os atributos de pessoa.
    public String getNome() {
        return nome;
    }

    public int getSexo() {
        return sexo;
    }
}
