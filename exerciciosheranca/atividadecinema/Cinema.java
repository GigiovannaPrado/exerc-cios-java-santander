package exerciciosheranca.atividadecinema;

import java.util.Scanner;

public class Cinema {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ingresso ingresso1 = new Ingresso(30);
        MeiaEntrada ingresso2 = new MeiaEntrada(30);
        IngressoFamilia ingresso3 = new IngressoFamilia(30);
        int opcao;
        System.out.println("-=-=-=-=-=-=-=-=-CINEMA-=-=-=-=-=-=-=-=-=-");
        System.out.println("Selecione uma opção: ");
        System.out.println("1 -> Ingresso comum ");
        System.out.println("2 -> Ingresso meia entrada ");
        System.out.println("3 -> Ingresso Familia ");
        System.out.print("--> ");
        opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
            case 1:
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.print("Nome do filme: ");
                String nome = scanner.nextLine();
                ingresso1.setNomeDOFilme(nome);
                int dl = 0;
                while (dl != 1 && dl != 2) {
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("Selecione uma opção: ");
                    System.out.println("1 -> dublado ");
                    System.out.println("2 -> legendado ");
                    dl = scanner.nextInt();
                    ingresso1.getDubLeg(dl);

                }
                System.out.println("-=-=-=-=-=-=-=-CONCLUSAO-=-=-=-=-=-=-=-");
                System.out.print(ingresso1.valorbase());
                System.out.println("•Filme: " + nome);
                if(dl == 1){
                    System.out.println("•Seçao: Dublada");
                }else{
                    System.out.println("•Seçao: Legendada");
                }
                System.out.println("Bom filme! ;)");
                break;

            case 2:
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.print("Nome do filme: ");
                String nome2 = scanner.nextLine();
                ingresso1.setNomeDOFilme(nome2);
                int dl2 = 0;
                while (dl2 != 1 && dl2 != 2) {
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("Selecione uma opção: ");
                    System.out.println("1 -> dublado ");
                    System.out.println("2 -> legendado ");
                    dl2 = scanner.nextInt();
                    ingresso2.getDubLeg(dl2);

                }
                System.out.println("-=-=-=-=-=-=-=-CONCLUSAO-=-=-=-=-=-=-=-");
                System.out.print(ingresso2.valorDesconto());
                System.out.println("•Filme: " + nome2);
                if(dl2 == 1){
                    System.out.println("•Seçao: Dublada");
                }else{
                    System.out.println("•Seçao: Legendada");
                }
                System.out.println("Bom filme! ;)");
                break;

            case 3:
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.print("Nome do filme: ");
                String nome3 = scanner.nextLine();
                ingresso1.setNomeDOFilme(nome3);
                int dl3 = 0;
                while (dl3 != 1 && dl3 != 2) {
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("Selecione uma opção: ");
                    System.out.println("1 -> dublado ");
                    System.out.println("2 -> legendado ");
                    dl3 = scanner.nextInt();
                    ingresso3.getDubLeg(dl3);
                }
                scanner.nextLine();
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("Quantos membros da familia: ");
                int m = scanner.nextInt();
                System.out.println("-=-=-=-=-=-=-=-CONCLUSAO-=-=-=-=-=-=-=-");
                System.out.print(ingresso3.calculo(m));
                System.out.println("•Filme: " + nome3);
                if(dl3 == 1){
                    System.out.println("•Seçao: Dublada");
                }else{
                    System.out.println("•Seçao: Legendada");
                }
                System.out.println("Bom filme! ;)");
                break;

            default:
                System.out.println("opcao invalida!");
        }
    }
}
