package Streams;


import imperative.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static Streams._Stream.Gender.FEMALE;
import static Streams._Stream.Gender.MALE;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<Person>();
        people.add(new Person("John", MALE));
        people.add(new Person("Peter", MALE));
        people.add(new Person("Sonu", MALE));
        people.add( new Person("Chotu", FEMALE));
        people.add(new Person("Kate", FEMALE));

//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);

//        boolean allFemale = people.stream()
//                .allMatch(person -> FEMALE.equals(person.gender));
//        System.out.println(allFemale);

        boolean anyFemale = people.stream()
                .anyMatch(person -> FEMALE.equals(person.gender));
        System.out.println(anyFemale);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE, FEMALE
    }

}
