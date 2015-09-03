/*
 * Escreva um programa Java que modele um objeto Empregado. (PARTE 01)
 */
package lista03.exercicio03;

// 1. Crie uma classe chamada Empregado.
public class Empregado {

    // 2. Dentro da classe, defina os atributos privados nome (String), cargo (String), salário (double), data de admissão (String).
    private String nome;
    private String cargo;
    private double salario;
    private String dataAdmissao;

    /* 
     * 3. Crie os métodos getters e setters dos atributos da classe Empregado 
     *    (Dica: clique com o botão direito, selecione Inserir Código->Getters e setter... e marcar todos atributos).
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    // 4. Defina o método receberAumento que recebe um parâmetro percentual (double) e não retorna valor algum (void).
    public void receberAumento(double percentual) {
        // 5. Dentro do método, retorne o valor da soma do atributo salario com a multiplicação de salário com o percentual.
        this.salario += (this.salario * percentual);
    }

    // 6. Defina o método calcularGanhoAnual que não recebe parâmetro e retorne o valor do salário anual do empregado (double).
    public double calcularGanhoAnual() {
        // 7. Dentro do método, retorne o valor da multiplicação do atributo salario com o número 12.
        double salarioAnual = (salario * 12);
        return salarioAnual;
    }
}
