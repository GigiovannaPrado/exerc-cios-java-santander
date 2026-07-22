package exercicioscollections.telefone;

public class Verificacao {

    public void verificacao8(long num) {
        String texto = String.valueOf(num);
        String primeiros4 = texto.substring(0, 4);
        String ultimos4 = texto.substring(4);

        System.out.println("Numero sem DDD com 9 digitos: ");
        System.out.printf("-> %s-%s", primeiros4, ultimos4);
    }

    public void verificacao10(long num){
        String texto = String.valueOf(num);
        String ddd = texto.substring(0, 2);
        String primeiros4 = texto.substring(2, 6);
        String ultimos4 = texto.substring(6);

        System.out.println("Numero com DDD: ");
        System.out.printf("-> (%s) %s-%s", ddd, primeiros4,ultimos4);
    }

    public void verificacao9(long num) {
        String texto = String.valueOf(num);
        String primeiros = texto.substring(0, 5);
        String ultimos = texto.substring(5);

        System.out.println("Numero sem DDD com 9 digitos: ");
        System.out.printf("-> %s-%s", primeiros, ultimos);
    }

    public void verificacao11(long num) {
        String texto = String.valueOf(num);
        String ddd = texto.substring(0, 2);
        String primeiros = texto.substring(2, 7);
        String ultimos = texto.substring(7);

        System.out.println("Numero com DDD com 11 digitos: ");
        System.out.printf("-> (%s) %s-%s", ddd, primeiros,ultimos);
    }
}
