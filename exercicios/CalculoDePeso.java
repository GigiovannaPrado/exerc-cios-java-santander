package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculoDePeso {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("->Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("->Digite sua altura: ");
        double altura = scanner.nextDouble();
        double calculoIMC = peso/(altura*altura);
        System.out.println("Conclusão com calculo IMC");
        if (calculoIMC <= 18.5){
            System.out.printf("Seu resultado foi de  %.2f%n", calculoIMC);
            System.out.println("conclusão: você esta abaixo do peso! ");

        } else if (calculoIMC >= 18.6 && calculoIMC <= 24.9) {
            System.out.printf("Seu resultado foi de  %.2f%n", calculoIMC);
            System.out.println("conclusão: Você tem um peso ideal!");

        } else if (calculoIMC >= 25 && calculoIMC <= 29.9) {
            System.out.printf("Seu resultado foi de  %.2f%n", calculoIMC);
            System.out.println("conclusão: Levemente acima do peso ");

        } else if (calculoIMC >= 30 && calculoIMC <= 34.9) {
            System.out.printf("Seu resultado foi de  %.2f%n", calculoIMC);
            System.out.println("conclusão: Obesidade grau |");

        }else if (calculoIMC >= 35 && calculoIMC <= 39.9) {
            System.out.printf("Seu resultado foi de  %.2f%n", calculoIMC);
            System.out.println("conclusão: Obesidade grau || (Severa) ");

        }else if (calculoIMC >= 40) {
            System.out.printf("Seu resultado foi de  %.2f%n", calculoIMC);
            System.out.println("conclusão: Obesidade ||| (morbida!)");
        }
    }
}
