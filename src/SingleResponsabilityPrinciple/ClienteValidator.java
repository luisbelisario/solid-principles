package SingleResponsabilityPrinciple;

public class ClienteValidator {

    public static boolean validaCPF(String cpf) {
        return cpf.length() == 11;
    }

    public static boolean validaEmail(String email) {
        return email.contains("@");
    }
}
