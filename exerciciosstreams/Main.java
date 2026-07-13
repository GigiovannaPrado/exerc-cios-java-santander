package exerciciosstreams;

import java.util.ArrayList;
import java.util.List;

import static exerciciosstreams.ContactType.EMAIL;
import static exerciciosstreams.ContactType.PHONE;
import static exerciciosstreams.Sex.FAMALE;
import static exerciciosstreams.Sex.MALE;

public class Main {
    static void main(String[] args) {
        List<User> users = new ArrayList<>(generateUser());

        users.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------");

        var values = users.stream().
                filter(u -> u.contacts().size() >= 2)
                .toList();
        values.forEach(System.out::println);

    }

    private static List<User> generateUser(){
        var contacts1 = List.of(
            new Contact("(11) 54634-3445", PHONE),
            new Contact("Mariasouzaa@gmail.com", EMAIL)
        );

        var contacts2 = List.of(
            new Contact("Lucasmaranhaes@gmail.com", EMAIL)
        );

        var contacts3 = List.of(
                new Contact("(33) 34563-5675", PHONE),
                new Contact("(33) 45453-9875", PHONE)
        );

        var contacts4 = List.of(
                new Contact("(44) 56855-4555", PHONE),
                new Contact("Pedrodealmeida@gmail.com", EMAIL)
        );
        var contacts5 = List.of(
                new Contact("LuizaAdmistradora@gmail.com", EMAIL),
                new Contact("Luizagomessilva@gmail.com", EMAIL)
        );

        var user1 = new User("Maria", 26, FAMALE, new ArrayList<>(contacts1));
        var user2 = new User("Lucas", 28, MALE, new ArrayList<>(contacts2));
        var user3 = new User("Sarah", 20, FAMALE, new ArrayList<>(contacts3));
        var user4 = new User("Pedro", 29, MALE, new ArrayList<>(contacts4));
        var user5 = new User("Luiza", 21, MALE, new ArrayList<>(contacts5));


        return List.of(user1, user2, user3, user4, user5);
    }


}
