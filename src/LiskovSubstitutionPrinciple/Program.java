package LiskovSubstitutionPrinciple;

// Uma classe base deve poder ser substituída pela sua classe derivada
// "Se nada como um pato mas precisa de baterias, então você pode ter um problema de abastração"
// Obs.: esse é um exemplo de violacao do principio LISP

public class Program {

    public static void main(String[] args) {
        Quadrado quad = new Quadrado(10.0, 5.0);
        System.out.println(quad.getAltura());
        System.out.println(quad.getLargura());
        // mesmo que eu passe 10 como parâmetro o programa vai atribuir 5 à altura do quadrado
        // pois quadrados tem que ter lados iguais
        // se eu colocar a condição para que os lados do quadrado sejam iguais estou violando as regras da classe base
        // isso quebraria a regra do princípio "Uma classe base deve poder ser substituída pela sua classe derivada"
        // já que no caso acima Retangulo não pode ser substituida por Quadrado
        System.out.println(quad.calcularArea());
    }
}
