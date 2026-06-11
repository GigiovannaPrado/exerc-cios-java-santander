package exercicios;

import java.util.Scanner;

public class CalculadoraSimples {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("=-=-=-=-=-=-CALCULADORA-SIMPLES-=-=-=-=-=-=");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("=>Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("=>Digite o segundo numero: ");
        double num2 = scanner.nextDouble();
        System.out.println("=>Escolha a operação que deseja fazer: (-, +, /, *)");
        char operacao = scanner.next().charAt(0);
        while (operacao != '+' && operacao != '-' && operacao != '/'  && operacao != '*'){
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("INVALIDO!, digite novamente");
            System.out.println("=>Escolha a operação que deseja fazer: (-, +, /, *)");
            operacao = scanner.next().charAt(0);
        }
        double resultado = 0;
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        switch (operacao){
            case '+':
                resultado = num1 + num2;
                System.out.printf("%s + %s = %s", num1, num2, resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.printf("%s - %s = %s", num1, num2, resultado);
                break;

            case '/':
                resultado = num1 / num2;
                System.out.printf("%s / %s = %s", num1, num2, resultado);
                break;

            case '*':
                resultado = num1 * num2;
                System.out.printf("%s * %s = %s", num1, num2, resultado);
                break;
        }
    }
}