package exercicosdaplataforma.banco2;

import java.util.Scanner;

public class TestBancoError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Leitura dos valores de entrada
            System.out.println("Digite o saldo: ");
            String saldoInput = scanner.nextLine();
            System.out.println("Digite o valor do saque: ");
            String saqueInput = scanner.nextLine();

            int saldo = Integer.parseInt(saldoInput.trim());
            int valorSaque = Integer.parseInt(saqueInput.trim());


            if(valorSaque <= 0){
                System.out.println("Valor invalido");
                return;
            }

            if (valorSaque > saldo) {
                System.out.println("Saldo insuficiente");
                return;
            }

            // Saque realizado com sucesso
            System.out.println("Saque realizado com sucesso!");
            int valorfinal = saldo - valorSaque;
            System.out.println("Saldo: " + valorfinal);

        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida");
        }
    }
}
