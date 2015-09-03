/*
 * Escreva um programa Java que implemente o objeto Funcionário. (PARTE 02)
 */
package lista03.exercicio05;

// 6. Crie uma classe TestaFuncionario com um bloco main.
public class TesteFuncionario {

    public static void main(String[] args) {
        // 7. Dentro do main, declare uma varíavel funcionario e inicialize-a com uma instância de Funcionario.
        Funcionario funcionario = new Funcionario(123456, "Fulano", Funcionario.SEXO_MASCULINO, 5000);
        

        // 8. Imprima o nome, matrícula, sexo e salário do funcionário.
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("Sexo: " + funcionario.getSexo());
        System.out.printf("Salário: R$ %.2f", funcionario.getSalario());
        System.out.println();

    }
}
// 9. Execute a classe TestaFuncionario e observe o resultado.
// 13 . Execute novamente a classe TestaFuncionario e observe o resultado.
