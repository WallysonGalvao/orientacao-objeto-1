/*
 * Escreva um programa que implemente o objeto Gerente. (PARTE 01)
 */
package lista03.exercicio06;

// 1. Crie uma classe Gerente que herda de Funcionário. 
public class Gerente extends Funcionario {
    // 2. Dentro da classe, defina o atributo bônus.
    double bonus;
    
    /* 
     * 3. Defina um construtor que inicialize os atributos matrícula, nome, sexo, salário e bônus
     *    (Dicar: chame o construtor da classe Funcionario e atualize o atributo bônus).
     */
    public Gerente(double bonus, int matricula, String nome, int sexo, double salario) {
        super(matricula, nome, sexo, salario);
        this.bonus = bonus;
    }
    
    // 4. Reescreva o método getSalario para retornar o valor do salário mais o bônus.
    @Override
    public double getSalario() {
        return salario + bonus;
    }   
}