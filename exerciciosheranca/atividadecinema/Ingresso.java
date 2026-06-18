package exerciciosheranca.atividadecinema;

public class Ingresso {
    protected double valor;
    protected String nomeDOFilme;
    protected int DubLeg;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public String valorbase(){
        this.valor = valor;
        System.out.println("Valor da entrada:RS" + valor);
        return "";
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeDOFilme(String nome) {
        return nomeDOFilme;
    }

    public void setNomeDOFilme(String nomeDOFilme) {
        this.nomeDOFilme = nomeDOFilme;
    }

    public int getDubLeg(int dl) {
        return DubLeg;
    }

    public void setDubLeg(int dubLeg) {
        DubLeg = dubLeg;
    }
}
