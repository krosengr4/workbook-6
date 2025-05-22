package comparator;

//!In this class, we implement the Comparable interface but with com.pluralsight.streams.Person object
public class Person implements Comparable<Person>{

    String name;

    public Person(String name) {
        this.name = name;
    }

    //region getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion

    //You can also compare strings based on alphabetical order
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }
}
