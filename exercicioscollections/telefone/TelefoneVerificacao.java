package exercicioscollections.telefone;

import java.util.Scanner;

public class TelefoneVerificacao {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("->Digite um numero de telefone: ");
        var num = scanner.nextLine();
        Verificacao verificacao = new Verificacao();

        String apenasNumeros = num.replaceAll("[^0-9]", "");
        long numtelefone = Long.parseLong(apenasNumeros);
        int quant = String.valueOf(numtelefone).length();
        if (quant == 8){
            verificacao.verificacao8(numtelefone);
        }else if(quant == 10){
            verificacao.verificacao10(numtelefone);
        }else if(quant == 9) {
            verificacao.verificacao9(numtelefone);
        }else if(quant == 11) {
            verificacao.verificacao11(numtelefone);
        }else{
            System.out.println("Numero INVALIDO!!!");
        }
    }
}
