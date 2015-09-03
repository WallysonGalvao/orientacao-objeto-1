/*
 * Escreva um programa Java que modele um objeto Empregado. (PARTE 02)
 */
package lista03.exercicio03;

// 8. Cria uma classe TestaEmpregado contendo um bloco main.
public class TestaEmpregado {
    public static void main(String[] args) {
        // 9. Dentro do main, defina uma variável empregado e inicialize-a com uma instância de Empregado.
        Empregado empregado = new Empregado();
        
        // 10. Atribua valores para os atributos de empregado (Dica: chame os métodos setters).
        empregado.setCargo("Chefe");
        empregado.setNome("Fulano");
        empregado.setSalario(5000);
        empregado.setDataAdmissao("01/01/2001");
        
        // 11. Imprima o salário de empregado (Dica: chame o método getSalario).
        System.out.printf("Salário: R$ %.2f", empregado.getSalario());
        System.out.println();
        
        // 12. Aumente o salário de funcionário em 10%.
        empregado.receberAumento(0.1);
        
        // 13. Imprima novamente o salário de funcionário.
        System.out.printf("Salário com Aumento: R$ %.2f", empregado.getSalario());
        System.out.println();
        
        // 14. Imprima o ganho anual de funcionário.
        System.out.printf("Ganho anual: R$ %.2f", empregado.calcularGanhoAnual());
        System.out.println();
    }
}
// 15 .xecute a classe TestaFuncionario e observe o resultado.