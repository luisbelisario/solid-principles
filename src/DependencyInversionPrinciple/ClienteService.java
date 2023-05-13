package DependencyInversionPrinciple;

import DependencyInversionPrinciple.interfaces.ClienteRepository;
import DependencyInversionPrinciple.interfaces.ClienteValidator;
import SingleResponsabilityPrinciple.Cliente;

import java.util.List;

public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteValidator clienteValidator;

    public ClienteService(ClienteRepository clienteRepository, ClienteValidator clienteValidator) {
        this.clienteRepository = clienteRepository;
        this.clienteValidator = clienteValidator;
    }

    public void addCliente(Cliente cliente) {
        if(clienteValidator.validaEmail(cliente.getEmail()) && clienteValidator.validaCPF(cliente.getCpf())) {
            clienteRepository.addCliente(cliente);
            System.out.println("Cliente adicionado com sucesso");
        } else {
            System.out.println("Dados do cliente " + cliente.getNome() + " estão incorretos");
        }
    }

    public void removeCliente(String cpf) {
        clienteRepository.removeCliente(cpf);
    }

    public void verTodosCLientes() {
        List<Cliente> clientes = clienteRepository.getClientes();
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
