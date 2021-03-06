package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation){
        // TODO -- start your code here

        if(operation == ADDITION)
            mOut.print(new Add(argumentOne, argumentTwo).toString());
        else if (operation == SUBTRACTION)
            mOut.print(new Subtract(argumentOne, argumentTwo).toString());
        else if (operation == MULTIPLICATION)
            mOut.print(new Multiply(argumentOne, argumentTwo).toString());
        else if (operation == DIVISION)
            mOut.print(new Divide(argumentOne, argumentTwo).toString());
    }
}
