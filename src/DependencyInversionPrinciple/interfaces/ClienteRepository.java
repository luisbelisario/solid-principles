package DependencyInversionPrinciple.interfaces;

import SingleResponsabilityPrinciple.Cliente;

import java.util.List;

public interface ClienteRepository {

    void addCliente(Cliente cliente);

    void removeCliente(String cpf);

    List<Cliente> getClientes();
}
