package exercicosdaplataforma.banco1;

public class Conta1 {
    private int saldo;

    public Conta1(int saldoInicial) {
    }

    public void Conta(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(int valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(int valor) {
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.saldo -= valor;
        // TODO: Permitir saque apenas se houver saldo suficiente
        // Dica: cheque se 'valor' é menor ou igual ao saldo antes de subtrair
    }

    public int getSaldo() {
        return saldo;
    }
}

