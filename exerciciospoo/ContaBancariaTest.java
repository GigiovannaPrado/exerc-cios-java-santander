package exerciciospoo;

import javax.xml.transform.Source;
import java.util.Scanner;

public class ContaBancariaTest {
    static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(500.0);
        Scanner scanner = new Scanner(System.in);
        int option;
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
            option = scanner.nextInt();
        } while (option <=0 || option> 7 );
        switch (option){
            case 1:
                System.out.println("Saldo da conta: "+contaBancaria.getSaldo());
            case 2:
                System.out.println();
        }


    }
}
