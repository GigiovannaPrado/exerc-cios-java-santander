package exerciciosheranca.atividadecinema;

public class MeiaEntrada extends Ingresso{

    public MeiaEntrada(double valor) {
        super(valor);
    }

    public String valorDesconto(){
        double valorfinal = this.getValor() /2;
        System.out.println("•Valor com o desconto de meia entrada: R$" + valorfinal);
        return "";
    }
}
