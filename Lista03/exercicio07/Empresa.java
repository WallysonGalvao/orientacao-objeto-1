/*
 * Escreva um programa que implemente o objeto Empresa.
 */
package lista03.exercicio07;

// 1. Crie uma classe chamada Empresa.
public class Empresa {
    // 2. Dentro da classe, defina o atributo funcionariosArray (Funcionario[]).
    Funcionario[] funcionariosArray;
    
    // 3. Defina o atributo totalFuncionarios inicializando-o com valor ZERO.
    int totalFuncionarios = 0;

    // 4. Defina um construtor recebe um parâmetro tamanho.
    public Empresa(int tamanho) {     
        /* 
         * 5. Dentro do construtor inicialize o atributo contasArray com a quantidade de posições definida pela variável tamanho
         *    (Dica: new Funcionario[tamanho]).
         */
        funcionariosArray = new Funcionario[tamanho];
    }
    
    // 6. Defina o método contratarFuncionario sem retorno que recebe como parâmetro uma instância de Funcionário.
    public void contratarFuncionario (Funcionario funcionario){
        /* 
         * 7. Dentro do método, armazene ne última posição preenchida de funcionariosArray
         *    (i.e. [totalFuncionarios]) e incremente o atributo totalFuncionarios.
         */
        funcionariosArray[totalFuncionarios] = funcionario;
        totalFuncionarios++;
    }
    
    // 8. Defina o método exibirFolhaPagamento sem parâmetro e sem retorno.
    public void exibirFolhaPagamento () {
        // 9. Dentro do método declare a variável totalFolha inicializado-a com ZERO.
        int totalFolha = 0;
        /* 
         * 10. Dentro do método crie um laço que imprima os funcionários da empresa contidos no array e ao final o total gasto com a folha de pagamento
         *     (Dica: somar os salários dos funcionários e gerentes).
         */
        for (int i = 0; i < funcionariosArray.length; i++) {
            System.out.println(funcionariosArray[i].toString());
        }
    }
}
