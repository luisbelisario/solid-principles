package OpenClosedPrinciple;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {


    @Override
    public String debitar(BigDecimal valor, String numeroConta) {
        // regras para debitar em conta poupança
        return numeroTransacao();
        // retorna o numero da transacao (metodo da super classe)
    }
}
