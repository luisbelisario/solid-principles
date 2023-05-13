package DependencyInversionPrinciple;

// Modulos de alto nível não devem depender de módulos de baixo nível.
// Ambos devem depender de abstrações
// Abstrações não devem depender de detalhes
// Detalhes devem depender de abstrações
// Ex.: tenho uma classe de CadastroCliente,
// essa classe não deve depender de detalhes de um classe de acesso a banco de dados

import SingleResponsabilityPrinciple.Cliente;

public class Program {

    public static void main(String[] args) {

        // Para usar os métodos da interface posso passar suas implementações concretas como parametro do construtor
        ClienteService clienteService = new ClienteService(new ClienteRepositoryImpl(), new ClienteValidatorImpl());

        Cliente c1 = new Cliente();
        c1.setNome("Luis");
        c1.setCpf("11111111111");
        c1.setEmail("luis@gmail.com");

        Cliente c2 = new Cliente();
        c2.setNome("Carlos");
        c2.setCpf("22222222222");
        c2.setEmail("carlos@gmail.com");

        clienteService.addCliente(c1);
        clienteService.addCliente(c2);

        clienteService.verTodosCLientes();

        clienteService.removeCliente("33333333333");

        clienteService.verTodosCLientes();
    }
}
