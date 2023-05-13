package InterfaceSegregationPrinciple;

// Classes clientes não devem ser forçadas a depender de métodos que não usam
// Muitas interfaces específicas são melhores do que uma única interface
// Repare que nas classes do programa so são implementados os métodos necessários para cada classe

public class Program {

    public static void main(String[] args) {
        CadastroCliente cadastroCliente = new CadastroClienteImpl();
        CadastroProduto cadastroProduto = new CadastroProdutoImpl();

        cadastroProduto.preencherDados();
        cadastroProduto.salvarDados();

        cadastroCliente.preencherDados();
        cadastroCliente.salvarDados();
        cadastroCliente.enviarEmail();
    }
}
