package DependencyInversionPrinciple;

import DependencyInversionPrinciple.interfaces.ClienteRepository;
import SingleResponsabilityPrinciple.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryImpl implements ClienteRepository {

    static List<Cliente> clientes = new ArrayList<>();

    @Override
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void removeCliente(String cpf) {
        for(Cliente c : clientes) {
            if(c.getCpf().equals(cpf)) {
                clientes.remove(c);
                return;
            }
        }
        System.out.println("Não foi encontrado cliente com os dados informados");
    }

    @Override
    public List<Cliente> getClientes() {
        return clientes;
    }
}
