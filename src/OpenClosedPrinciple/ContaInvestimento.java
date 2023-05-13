package OpenClosedPrinciple;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta {


    @Override
    public String debitar(BigDecimal valor, String numeroConta) {
        // regras para debitar em conta investimento
        return numeroTransacao();
        // retorna o numero da transacao (metodo da super classe)
    }
}
