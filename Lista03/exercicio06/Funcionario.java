package lista03.exercicio06;

public class Funcionario extends Pessoa {

    private int matricula;
    public double salario;

    public Funcionario(int matricula, String nome, int sexo, double salario) {
        super(nome, sexo);
        this.matricula = matricula;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }
}
