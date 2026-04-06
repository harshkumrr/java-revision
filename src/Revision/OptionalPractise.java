package Revision;

import java.util.Optional;

public class OptionalPractise {
    public static void main(String[] args) {
        Optional<String> str = Optional.ofNullable(null);
        System.out.println(str.isPresent());

        Optional<String> str2 = Optional.of("Harsh");
        str2.ifPresent(x-> System.out.println("name: "+x));

        Optional<String> str3 = Optional.ofNullable(null);
        System.out.println(str3.orElseGet(()-> "Default name"));
    }
}
