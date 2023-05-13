package DependencyInversionPrinciple;

import DependencyInversionPrinciple.interfaces.ClienteValidator;

public class ClienteValidatorImpl implements ClienteValidator {

    @Override
    public boolean validaCPF(String cpf) {
        return cpf.length() == 11;
    }

    @Override
    public boolean validaEmail(String email) {
        return email.contains("@");
    }
}
