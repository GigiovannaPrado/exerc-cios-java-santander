package exerciciosheranca.atividadesistema;
// esse projeto nao é nenhum software desemvolvido ou nada do tipo, é apenas pra praticar o conceito de herança.


public class Test {
    static void main(String[] args) {
        Gerente gerente = new Gerente();
        Vendendor vendendor = new Vendendor();
        Atendente atendente = new Atendente();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-GERENTE-=-=-=-=-=-=-=-=-=-");
        gerente.setNome("fernando");
        gerente.setEmail("fernandogomes@gmail.com");
        gerente.setSenha("12345");
        gerente.login();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("-=-=-=-=-=-=-=-=-=VENDEDOR-=-=-=-=-=-=-=-=-=-=");
        vendendor.setNome("Paulo");
        vendendor.setEmail("Paulosilvaa@gmail.com");
        vendendor.setSenha("Paulo9090");
        vendendor.login();
        System.out.println("------------------------------");
        System.out.println(vendendor.getQuantidadeVendas());


        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-ATENDENTE-=-=-=-=-=-=-=-=-=-");
        atendente.setNome("Agatha");
        atendente.setEmail("Agathanunes@gmail.com");
        atendente.setSenha("4545445454");
        atendente.login();
        System.out.println("------------------------------");
        System.out.println(atendente.receberPagamentos(200));
        System.out.println(atendente.valorCaixaa());
        System.out.println(atendente.fecharCaixa());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
