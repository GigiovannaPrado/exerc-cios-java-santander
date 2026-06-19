package exerciciosheranca.atividadesistema;
// esse projeto nao é nenhum software desemvolvido ou nada do tipo, é apenas pra praticar o conceito de herança.

public class Atendente extends Gerente{
    private double valorCaixa;
    private double valor1;

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


    public String receberPagamentos(double valor){
        this.valor1 = valor;
        System.out.print("Recebendo pagamentos...");
        return "";
    }

    public double valorCaixaa(){
        this.valorCaixa = this.valorCaixa + valor1;
        System.out.print("valor do caixa: ");
        return this.valorCaixa ;
    }

    public String fecharCaixa(){
        System.out.print("Caixa fechado.");
        return "";
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }
}
