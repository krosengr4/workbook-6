package com.pluralsight.streampart2;

import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        boolean ifContinue = true;

        while (ifContinue) {
            System.out.println("Please enter a first OR last name: ");
            String userNameChoice = myScanner.nextLine();

            matchUserChoice(userNameChoice);
            getAverageAge();
            getMinMaxAge();

            System.out.println("Search again? (Y or N) ");
            String searchAgain = myScanner.nextLine();

            if (!searchAgain.equalsIgnoreCase("y")) {
                ifContinue = false;
            }
        }

        boolean personFound = false;
        double sumOfAges = 0;


    }

    public static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Chad", "Smith", 34));
        people.add(new Person("Bing", "Bong", 115));
        people.add(new Person("Sam", "Labam", 12));
        people.add(new Person("Dontavius", "Laquavious", 62));
        people.add(new Person("Charlie", "Charles", 23));
        people.add(new Person("Sarah", "Smith", 8));
        people.add(new Person("Mega", "Tron", 91));
        people.add(new Person("Mc", "Lovin", 17));
        people.add(new Person("Gort", "Gort", 34));
        people.add(new Person("Foo", "Bar", 39));

        return people;
    }

    public static void matchUserChoice(String userNameChoice) {

        List<Person> people = getPeople();

        List<Person> matchPerson = people.stream()
                .filter(person -> userNameChoice.equalsIgnoreCase(person.firstName)
                        || userNameChoice.equalsIgnoreCase(person.lastName))
                .toList();

        if (matchPerson.isEmpty()) {
            System.err.println("Womp Womp! Could not find anybody with that first or last name.\n");
        } else {
            matchPerson.forEach(person -> {
                System.out.printf("""
                        
                        -----MATCHES-----
                        %s %s | Age: %d
                        \n""", person.getFirstName(), person.getLastName(), person.getAge());
            });
        }
    }

    public static void getAverageAge() {
        List<Person> people = getPeople();

//        double averageAge = people.stream()
//                .mapToInt(Person :: getAge)
//                .average()
//                .orElse(0.0);

        double sumOfAges = people.stream()
                .map(p -> p.getAge())
                .reduce(0, (temp, age) -> temp += age);


        double averageAge = sumOfAges / people.size();
        System.out.println("Average Age: " + averageAge + " years");
    }

    public static void getMinMaxAge() {
        List<Person> people = getPeople();

        int maxAge = people.stream()
                .map(Person::getAge)
                .sorted()
                .toList()
                .getLast();

        int minAge = people.stream()
                .map(Person::getAge)
                .sorted()
                .toList()
                .getFirst();

        String youngestName = people.stream()
                .sorted()
                .toList()
                .getFirst().firstName;

        String oldestName = people.stream()
                .sorted()
                .toList()
                .getLast().firstName;

        System.out.printf("Youngest Person: %s at %d years old.\nOldest Person: %s at %d years old.\n",
                youngestName, minAge, oldestName, maxAge);
    }
}