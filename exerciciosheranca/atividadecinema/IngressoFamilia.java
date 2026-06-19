package exerciciosheranca.atividadecinema;

public class IngressoFamilia extends  Ingresso{

    public IngressoFamilia(double valor) {
        super(valor);
    }

    public String calculo(int membros){
        valor = getValor();
        double valortotal = valor * membros;
        System.out.println("•Para "+ membros +" pessoas o valor fica: R$ "+ valortotal);;
        if (membros > 3){
            System.out.println("•Valor final com o desconto:R$ "+ valortotal  * 0.95);

        }
        return "";
    }

}
