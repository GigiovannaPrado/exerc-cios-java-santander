package exercicioscollections.calculadora;

import java.util.*;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Scanner;

//uma atividade onde tive que cirar uma calculadora para as operaçoes de soma e subtracao, o usario devde informar
//todos os numeros que seram usados de uma vez usando virgulas pra separa-los


public class CalculadoraTest {
   public static void main(String[] args) {
        String num = null;
        int escolha;
        Scanner scanner = new Scanner(System.in);
        impressao impressao = new impressao();
        impressao.introducao();
        num = (scanner.nextLine());
        System.out.println(num);
        List<Integer> listNum = Arrays.stream(num.split(","))
                .map(String::trim)
                .filter(s -> s.matches("\\d+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        impressao.escolhaOperacao();
        escolha = scanner.nextInt();
        while (escolha != 1 && escolha != 2 ){
             System.out.println("INVALIDO!!!");
             impressao.escolhaOperacao();
             escolha = scanner.nextInt();
        }
        int tamanho = listNum.size();
        int soma = 0;
        int sub = listNum.get(0);
        switch (escolha){
             case 1:
                  System.out.println("Somando os numeros: "+ listNum);
                  for (int i = 0; i < listNum.size(); i++) {
                       soma += listNum.get(i);
                  }
                  System.out.println("A soma dos "+ tamanho+" numeros é de: "+ soma);
                  break;

             case 2:
                  System.out.println("Subtraindo os numeros: "+ listNum);
                  for (int i = 1; i < listNum.size(); i++) {
                       sub -= listNum.get(i);
                  }
                  System.out.println("A sub dos "+ tamanho+" numeros é de: "+ sub);
                  break;

        }




    }
}
