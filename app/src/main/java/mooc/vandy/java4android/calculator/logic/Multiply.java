package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply implements MathOperation{
    // TODO -- start your code here

    private int op1;
    private int op2;
    private int product;

    //Constructor for the Multiply object
    public Multiply(int op1, int op2){
        this.op1 = op1;
        this.op2 = op2;
        makeOperation();
    }

    @Override
    //Perform the multiplication operation
    public void makeOperation() {
        product = op1 * op2;
    }

    //Override the toString method
    public String toString(){
        return String.valueOf(product);
    }
}
