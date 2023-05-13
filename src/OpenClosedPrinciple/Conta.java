package OpenClosedPrinciple;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Conta {

    public String numeroTransacao() {
        return UUID.randomUUID().toString();
        // metodo para retornar um numero aleatorio decorrente de uma transacao efetuada em qualquer Conta
    };

    public abstract String debitar(BigDecimal valor, String numeroConta);
}
