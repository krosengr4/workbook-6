package Generics;

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

    public void perform() {
         left.perform();
         right.perform();
    }
}
