package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements MathOperation{

    // TODO -- start your code here

    private int op1;
    private int op2;
    private int sum;

    //Constructor for the Add object
    public Add(int op1, int op2){
        this.op1 = op1;
        this.op2 = op2;
        makeOperation();
    }

    @Override
    //Perform the addition operation
    public void makeOperation() {
        sum = op1 + op2;
    }

    //Override the toString method
    public String toString(){
        return String.valueOf(sum);
    }

}
