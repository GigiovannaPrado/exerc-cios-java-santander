package exerciciospoo;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double limiteTotal = saldo + chequeEspecial;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
        cheque();
    }

    public double cheque(){
        if (this.saldo <= 500){
            this.chequeEspecial = + 50;
        }else{
            this.chequeEspecial = + (this.saldo * 0.5);
        }
        return chequeEspecial;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getLimiteTotal() {
        return  saldo + chequeEspecial;
    }

    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }
}
