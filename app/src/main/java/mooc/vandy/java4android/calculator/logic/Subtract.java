package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements MathOperation{
    // TODO -- start your code here

    private int op1;
    private int op2;
    private int difference;

    //Constructor for the Subtract object
    public Subtract(int op1, int op2){
        this.op1 = op1;
        this.op2 = op2;
        makeOperation();
    }

    @Override
    //Perform the subtraction operation
    public void makeOperation() {
        if(op1 >= op2)
            difference = op1 - op2;
        else
            difference = op2 - op1;
    }

    //Override the toString method
    public String toString(){
        return String.valueOf(difference);
    }
}
