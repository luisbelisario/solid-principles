package SingleResponsabilityPrinciple;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    static List<Cliente> clientes = new ArrayList<>();

    public static void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public static void removeCliente(String cpf) {
        for(Cliente c : clientes) {
            if(c.getCpf().equals(cpf)) {
                clientes.remove(c);
                return;
            }
        }
        System.out.println("Não foi encontrado cliente com os dados informados");
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }
}
