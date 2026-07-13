package exerciciosstreams;

import java.util.List;

public record User(String name, int idade, Sex sex, List<Contact> contacts) {
}
