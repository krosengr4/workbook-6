package Generics;

public class Labeler {

    public <T> void displayWithLabel (String label, T value) {
        System.out.println(label + ": " + value);
    }

}
