package Optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Object s = Optional.ofNullable(null)
                .orElseGet(() -> "Hello World");
        System.out.println(s);
    }
}
