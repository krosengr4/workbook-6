package com.pluralsight.streampart2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        List<Person> people = getPeople();

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a first OR last name: ");
        String userNameChoice = myScanner.nextLine();

        boolean personFound = false;
        double sumOfAges = 0;

        for (Person p : people) {
            if (userNameChoice.equalsIgnoreCase(p.getFirstName()) || userNameChoice.equalsIgnoreCase(p.getLastName())) {
                System.out.printf("""
                        \t-----MATCHES-----
                        %s %s | Age: %d
                        \n""", p.getFirstName(), p.getLastName(), p.getAge());
                personFound = true;

            }
            sumOfAges += p.getAge();
        }

        if (!personFound) {
            System.err.println("Womp Womp! Could not find anybody with that first or last name.\n");
        }

        double averageAge = sumOfAges / people.size();
        people.sort(Person::compareTo);

        System.out.printf("Average age of all people: %.2f\nYoungest com.pluralsight.streams.Person: %s %s at %d\nOldest com.pluralsight.streams.Person: %s %s at %d",
                averageAge, people.getFirst().firstName, people.getFirst().getLastName(), people.getFirst().age, people.getLast().firstName,
                people.getLast().lastName, people.getLast().age);
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
}