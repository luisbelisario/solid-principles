package SingleResponsabilityPrinciple;

// Esse principio diz que uma classe deve ter um e só um motivo para mudar
// Essa frase deve ser entendida também em conjunto com o contexto do ramo do negocio
// Ex.: deve-se separar o software que é do financeiro, do rh, do marketing
// Para que aquela parte do software só mude para atender aquele ramo do negócio
// O SRP aplica-se tambem a metodos, modulos e todos os outros artefatos de software
// No programa abaixo repare que cada classe tem sua responsabilidade bem definida

public class Program {
    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.setNome("Luis");
        c1.setCpf("11111111111");
        c1.setEmail("luis@gmail.com");

        Cliente c2 = new Cliente();
        c2.setNome("Carlos");
        c2.setCpf("22222222222");
        c2.setEmail("carlos@gmail.com");

        ClienteService.addCliente(c1);
        ClienteService.addCliente(c2);

        ClienteService.verTodosCLientes();

        ClienteService.removeCliente("33333333333");

        ClienteService.verTodosCLientes();
    }
}