package exerciciospoo;

import javax.xml.transform.Source;
import java.util.Scanner;

public class ContaBancariaTest {
    static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(500.0);
        Scanner scanner = new Scanner(System.in);
        int option;
        double deposito;
        double saque;
        double boleto;

        do {
            System.out.println("-------------------------------------------------------");
            System.out.println("Ecolha um numero para a operaçao que deseja: fazer");
            System.out.println("1 -> Consultar saldo");
            System.out.println("2 -> Consultar cheque especial");
            System.out.println("3 -> Depositar dinheiro");
            System.out.println("4 -> Sacar dinheiro");
            System.out.println("5 -> Pagar um boleto");
            System.out.println("6 -> Verificar se a conta esta usanso cheque especial ");
            System.out.println("7 -> Sair");
            System.out.println("-------------------------------------------------------");
            System.out.print("--> ");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Saldo da conta: "+contaBancaria.getSaldo());
                    break;
                case 2:
                    System.out.println("Seu limite de cheque especial é de R$ " + contaBancaria.cheque());
                    break;
                case 3:
                    System.out.print("Digite o Valor a ser depositado: ");
                    deposito = scanner.nextDouble();
                    contaBancaria.setSaldo(contaBancaria.getSaldo()+deposito);
                    break;
                case 4:
                    System.out.print("Digite o valor que deseja sacar: ");
                    saque = scanner.nextDouble();
                    if (saque <= contaBancaria.getLimiteTotal()) {
                        contaBancaria.sacar(saque);
                        System.out.println("Saque realizado com sucesso.");
                        System.out.println("Saldo atual: " + contaBancaria.getSaldo());
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 5:
                    System.out.print("Digite o valor do boleto: ");
                    boleto = scanner.nextDouble();

                    if (boleto <= contaBancaria.getLimiteTotal()) {
                        contaBancaria.sacar(boleto);
                        System.out.println("Boleto pago com sucesso.");
                        System.out.println("Saldo atual: " + contaBancaria.getSaldo());
                    } else {
                        System.out.println("Saldo insuficiente para pagar o boleto.");
                    }
                    break;
                case 6:
                    if (contaBancaria.getSaldo() < 0) {
                        double usadoCheque = Math.abs(contaBancaria.getSaldo());
                        double taxa = usadoCheque * 0.2;

                        System.out.println("Usando R$ " + usadoCheque + " do cheque especial.");
                        System.out.println("Taxa atual: R$ " + taxa);
                    } else {
                        System.out.println("Nao esta usando cheque especial.");
                    }
                    break;
                case 7:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opccao incorreta!Tente novamente");
            }
        } while (option != 7 );
    }
}
