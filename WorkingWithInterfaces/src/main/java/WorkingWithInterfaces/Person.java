package WorkingWithInterfaces;

public class Person implements Comparable<Person>{

    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //region getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //endregion

    //The object inside the compareTo() is o
    public int compareTo(Person o) {

        if (this.lastName.compareTo(o.lastName) != 0) {
            return this.lastName.compareTo(o.lastName);
        } else if (this.firstName.compareTo(o.firstName) != 0) {
            return this.firstName.compareTo(o.firstName);
        } else if (this.age == o.age){
            return 0;
        } else if (this.age > o.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
