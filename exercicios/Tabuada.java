package exercicios;

import java.util.Scanner;

public class Tabuada {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=> Escolha um numero para ver sua tabuada: (de 1 a 20)");
        int num = scanner.nextInt();
        while (num < 1 || num > 20){
            System.out.println("------------------------------------------------------------------------");
            System.out.println("NUMERO INVALIDO! escolha um numero entre 1 e 20!");
            System.out.println("=> Escolha um numero para ver sua tabuada: (de 1 a 20)");
            num = scanner.nextInt();
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------TABUADA DO "+ num +"------------------------------");
        for (int i = 1; i < 11; i++) {
            System.out.println(i + "X" + num +" = "+ i*num );
        }
    }
}
