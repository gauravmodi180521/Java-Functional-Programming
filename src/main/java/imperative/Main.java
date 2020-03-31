package imperative;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("John",Gender.MALE));
        people.add(new Person("Peter",Gender.MALE));
        people.add(new Person("Sonu",Gender.MALE));
        people.add( new Person("Chotu",Gender.FEMALE));
        people.add(new Person("Kate",Gender.FEMALE));

        // Imperative approach
        List<Person> females = new ArrayList<Person>();
        for(Person person : people)
        {
            if(person.gender.equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        for(Person female : females)
        {
            System.out.println(female);
        }
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
