package exerciciospoo;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial = 0;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        if (this.saldo <= 500){
            this.chequeEspecial = chequeEspecial + 50;
        }else{
            this.chequeEspecial = chequeEspecial + (this.saldo * 0.5);
        }
    }
}
