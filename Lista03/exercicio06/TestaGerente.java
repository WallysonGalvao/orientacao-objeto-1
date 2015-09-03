/*
 * Escreva um programa que implemente o objeto Gerente. (PARTE 02)
 */
package lista03.exercicio06;

// 5. Crie uma classe TestaGerente com um bloco main.
public class TestaGerente {
    public static void main(String[] args) {
        // 6. Dentro do main, declare uma varíavel gerente e inicialize-a com uma instância de Gerente.
        Gerente gerente = new Gerente(6000, 654321, "Fulano", Pessoa.SEXO_MASCULINO, 10000.00);
        
        // 7. Imprima o nome, matrícula, sexo e salário do gerente.
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Matrícula: " + gerente.getMatricula());
        System.out.println("Sexo: " + gerente.getSexo());
        System.out.printf("Salário: %.2f", gerente.getSalario());
        System.out.println();
        
        // 9. No main da classe TestaGerente, Declare uma variável funcionario e inicialize com o valor da variável gerente.
        Funcionario funcionario = new Gerente(2000, 123456, "Siclana", Pessoa.SEXO_FEMININO, 5000);
        
        System.out.println("====================");
        
        // 10. Imprima o nome, matrícula, sexo e salário do funcionario.
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("Sexo: " + funcionario.getSexo());
        System.out.printf("Salário: %.2f", funcionario.getSalario());
        System.out.println();
    }
}
// 8. Execute a classe TestaGerente e observe o resultado.
// 11. Execute novamente a classe TestaGerente e observe o resultado.
