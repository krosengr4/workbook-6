package Generics;

//Making a class that instantiates pairs of integers.
//!This can only be used with integers
public class IntegerPair {

    int leftNumber;
    int rightNumber;

    public IntegerPair(int leftNumber, int rightNumber) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
    }

    //region getters and setters
    public int getLeftNumber() {
        return leftNumber;
    }

    public void setLeftNumber(int leftNumber) {
        this.leftNumber = leftNumber;
    }

    public int getRightNumber() {
        return rightNumber;
    }

    public void setRightNumber(int rightNumber) {
        this.rightNumber = rightNumber;
    }
    //endregion

    //Swap method will swap the right and left integer values
    public void swap() {
        int temp = this.leftNumber;
        this.leftNumber = this.rightNumber;
        this.rightNumber = temp;
    }
}
