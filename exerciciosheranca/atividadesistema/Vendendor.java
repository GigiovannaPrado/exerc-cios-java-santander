package exerciciosheranca.atividadesistema;
// esse projeto nao é nenhum software desemvolvido ou nada do tipo, é apenas pra praticar o conceito de herança.

public class Vendendor extends Gerente {
    private double quantidadeVendas;

    @Override
    public boolean add(){
        return false;
    }

    @Override
    public String login(){
        System.out.println("Realizando login...");
        System.out.println("NOME: "+ getNome());
        System.out.println("EMAIL: "+ getEmail());
        System.out.print("SENHA: ");
        int s =  getSenha().length();
        for (int i = 0; i < s; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        return "";
    }

    public double getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(double quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }
}
