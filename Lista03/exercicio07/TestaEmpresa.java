package lista03.exercicio07;

// 11. Crie a classe TestaEmpresa com um bloco main.
public class TestaEmpresa {

    public static void main(String[] args) {
        /* 
         * 12. Dentro do main, declare a variável empresa inicializando-a com uma instância de Empresa
         *     (Dica: chame o construtor com o parâmetro 10).
         */
        Empresa empresa = new Empresa(5);

        /* 
         * 13. Crie várias instâncias de Funcionário e de Gerente e faça com cada uma seja contratada pela empresa
         *     Dica: chamar o método contratarFuncionario(new Funcionario() ou new Gerente()).
         */
        empresa.contratarFuncionario(new Funcionario(123456, "Fulano", Pessoa.SEXO_MASCULINO, 2000));
        empresa.contratarFuncionario(new Funcionario(123455, "Ciclana", Pessoa.SEXO_FEMININO, 3000));
        empresa.contratarFuncionario(new Funcionario(123454, "Beltrano", Pessoa.SEXO_MASCULINO, 4000));

        empresa.contratarFuncionario(new Gerente(200, 654321, "Gerente", Pessoa.SEXO_FEMININO, 6000));
        empresa.contratarFuncionario(new Gerente(2000, 654322, "Gerente - RH", Pessoa.SEXO_FEMININO, 8000));

        // 14. Imprima a folha de pagamento da empresa.
        empresa.exibirFolhaPagamento();
    }
}
// 15. Execute a classe TestaEmpresa e observe o resultado.
