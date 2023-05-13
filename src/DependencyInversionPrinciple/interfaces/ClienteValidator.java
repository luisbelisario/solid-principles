package DependencyInversionPrinciple.interfaces;

public interface ClienteValidator {

    boolean validaCPF(String cpf);

    boolean validaEmail(String email);
}
