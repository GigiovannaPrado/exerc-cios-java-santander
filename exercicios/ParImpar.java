package exercicios;

import java.util.Scanner;

public class ParImpar {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        System.out.print("-> ");
        int numMenor = scanner.nextInt();
        System.out.println("Digite um numero maior que o anterior: ");
        System.out.print("-> ");
        int numMaior = scanner.nextInt();
        while (numMenor > numMaior){
            System.out.println("----------------------------------");
            System.out.println("INVALIDO! tente novamente!");
            System.out.println("Digite um numero maior que o anterior: ");
            System.out.print("-> ");
            numMaior = scanner.nextInt();
        }
        System.out.println("escolha impar ou par (digite I ou P: ");
        System.out.print("-> ");
        char parimpar = scanner.next().toUpperCase().charAt(0);
        while (parimpar != 'P' && parimpar !='I'){
            System.out.println("------------------------------------");
            System.out.println("INVALIDO! tente novamente!");
            System.out.println("escolha impar ou par (digite I ou P: ");
            System.out.print("-> ");
            parimpar = scanner.next().toUpperCase().charAt(0);
        }
        if (parimpar == 'I'){
            for (int i = numMenor; i < numMaior ; i++) {
                if(i % 2 != 0){
                    System.out.println(i+" ");
                }
            }
        }else if (parimpar == 'P'){
            for (int i = numMenor; i <numMaior ; i++) {
                if (i % 2 == 0){
                    System.out.print(i+" ");
                }
            }
        }

    }
}