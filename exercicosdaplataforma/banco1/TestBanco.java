package exercicosdaplataforma.banco1;

import java.util.Scanner;

// Classe Conta com saldo encapsulado

public class TestBanco{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldoInicial = 0;

        try {
            System.out.println("Saldo inicial: ");
            saldoInicial = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Erro: Você precisa digitar um número inteiro válido!");
        }

        Conta1 conta = new Conta1(saldoInicial);

        while (true) {
            System.out.println("------------------------------------------");
            System.out.println("Digite a operacao:");
            System.out.println("depositar (digite a quantia que quer depositar)");
            System.out.println("sacar (digite a quantia que quer sacar)");
            System.out.println("fim (finaliza o programa)");
            System.out.println("------------------------------------------");
            String comando = scanner.nextLine().trim();
            if (comando.equals("fim")) break;

            String[] partes = comando.split(" ");
            String operacao = partes[0];
            int valor = Integer.parseInt(partes[1]);

            if (operacao.equals("depositar")) {
                conta.depositar(valor);
            } else if (operacao.equals("sacar")) {
                conta.sacar(valor);
            }
        }

        System.out.println(conta.getSaldo());
    }
}