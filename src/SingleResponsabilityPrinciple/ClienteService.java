package SingleResponsabilityPrinciple;

import java.util.List;

public class ClienteService {

    public static void addCliente(Cliente cliente) {
        if(ClienteValidator.validaEmail(cliente.getEmail()) && ClienteValidator.validaCPF(cliente.getCpf())) {
            ClienteRepository.addCliente(cliente);
            System.out.println("Cliente adicionado com sucesso");
        } else {
            System.out.println("Dados do cliente " + cliente.getNome() + " estão incorretos");
        }
    }

    public static void removeCliente(String cpf) {
        ClienteRepository.removeCliente(cpf);
    }

    public static void verTodosCLientes() {
        List<Cliente> clientes = ClienteRepository.getClientes();
        if(clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado");
        } else {
            System.out.println("LISTANDO TODOS OS CLIENTES");
            System.out.println("-------------------------");
            clientes.forEach(cliente -> {
                System.out.println(cliente.getNome());
                System.out.println(cliente.getCpf());
                System.out.println(cliente.getEmail());
                System.out.println("-----------------");
            });
        }
    }
}
