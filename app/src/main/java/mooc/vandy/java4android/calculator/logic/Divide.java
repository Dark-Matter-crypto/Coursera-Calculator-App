package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements MathOperation{
    // TODO -- start your code here

    private int op1;
    private int op2;
    private int quotient;
    private int remainder;

    //Constructor for the Divide object
    public Divide(int op1, int op2){
        this.op1 = op1;
        this.op2 = op2;
        makeOperation();
    }

    @Override
    //Perform the division operation
    public void makeOperation() {
        if (op2 != 0){
            quotient = op1 / op2;
            remainder = op1 % op2;
        }
    }

    //Override the toString method
    public String toString(){
        if (op2 == 0){
            return "Illegal divisor operand provided.";
        }
        return quotient + " R:" + remainder;
    }
}
