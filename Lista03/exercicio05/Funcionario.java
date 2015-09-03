/*
 * Escreva um programa Java que implemente o objeto Funcionário. (PARTE 01)
 */
package lista03.exercicio05;

// 1. Crie uma classe chamada Funcionario.

// 10. Altere a classe Funcionario para herdar a classe Pessoa (Dica: utilize a cláusula extends).
public class Funcionario extends Pessoa {

    // 2. Defina as constantes públicas estáticas SEXO_MASCULINO e SEXO_FEMININO, inicializando-as com os valores 1 e 2 respectivamente.
    // 11. Remova os atributos nome e sexo bem como as constantes SEXO_MASCULINO e SEXO_FEMININO.
    /* public static final int SEXO_MASCULINO = 1;
       public static final int SEXO_FEMININO = 2;
     */

    // 3. Defina os atributos matrícula, nome, sexo e salário.
    // private String nome;
    // private int sexo;
    private int matricula;    
    private double salario;

    // 4. Defina um construtor que inicialize os atributos matrícula, nome, sexo e salário.
    public Funcionario(int matricula, String nome, int sexo, double salario) {
        super(nome, sexo);
        this.matricula = matricula;
        //this.nome = nome;
        //this.sexo = sexo;
        this.salario = salario;
    }

    // 5. Defina somente os métodos getters para os atributos de funcionário.
    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }
    
    // 12. Remova os métodos getNome e getSexo da classe Funcionario.
    /* public String getNome() {
     return nome;
     }

     public int getSexo() {
     return sexo;
     }*/
}
