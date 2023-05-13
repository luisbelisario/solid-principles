package OpenClosedPrinciple;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    @Override
    public String debitar(BigDecimal valor, String numeroConta) {
        // regras para debitar em conta corrente
        return numeroTransacao();
        // retorna o numero da transacao (metodo da super classe)
    }
}
