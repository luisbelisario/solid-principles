package OpenClosedPrinciple;

// Esse princípio diz que entidades de sooftware (classes, módulos, funçôes),
// devem estar abertas para extensôes mas fechadas para modificaçôes
// Uma vez que a classe está fechada, concluída o ideal é que evitemos que haja modificações nela
// No programa abaixo repare que tenho uma classe abstrata Conta e a partir dela posso criar varios outros tipos

public class Program {

    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaInvestimento = new ContaInvestimento();
        Conta contaPoupanca = new ContaPoupanca();

        // todas são Contas por isso posso declara-las como do tipo Conta (polimorfismo)
    }
}
