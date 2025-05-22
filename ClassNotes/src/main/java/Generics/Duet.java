package Generics;

//! Generic class where data type is a child of musician
//We do this so we can call the perform() method for a duet of musician,
//but also be able to create Duet's of other data types that don't perform
public class Duet <T extends Musician>{

    private T left;
    private T right;

     Duet (T left, T right) {
         this.left = left;
         this.right = right;
     }

     //region getters
    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }
    //endregion

    //perform() method only available for dataTypes with perform method in their parent class
    //Ex: A duet of type integer CANNOT perform
    public void perform() {
         left.perform();
         right.perform();
    }
}
