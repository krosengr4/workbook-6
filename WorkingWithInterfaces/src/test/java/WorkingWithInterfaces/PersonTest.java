package WorkingWithInterfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void compareTo() {

        Person me = new Person("Kevin", "Rosengren", 245);
        Person you = new Person("Susie", "Snazzerton", 123);

        int actual = me.compareTo(you);

        //R minus S equals -1
        assertEquals(-1, actual);
    }

    @Test
    void compareSameLastName() {
        Person p1 = new Person("Alex", "Last", 19);
        Person p2 = new Person("Zach", "Last", 21);

        int actual = p1.compareTo(p2);

        //A minus Z equals -25
        assertEquals(-25, actual);
    }

    @Test
    void compareSameFirstAndLast() {
        Person p1 = new Person("First", "Last", 30);
        Person p2 = new Person("First", "Last", 20);

        int actual = p1.compareTo(p2);

        assertEquals(1, actual);
    }

    @Test
    void compareSameFirstLastAndAge() {
        Person p1 = new Person("First", "Last", 30);
        Person p2 = new Person("First", "Last", 30);

        int actual = p1.compareTo(p2);

        assertEquals(0, actual);
    }
}