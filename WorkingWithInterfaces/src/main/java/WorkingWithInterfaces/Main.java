package WorkingWithInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );
        myFamily.add( new Person("First", "Zzzzz", 17) );
        myFamily.add( new Person("Last", "Aaaaaa", 67) );
        myFamily.add( new Person("Last", "Aaaaaa", 67) );

        myFamily.sort(Person::compareTo);

        for (Person p : myFamily) {
            System.out.println("Name: " + p.getFirstName() + " " + p.getLastName() + " age: " + p.getAge());
        }
    }
}
