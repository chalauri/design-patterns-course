package ge.edu.sangu.interpreter;

import ge.edu.sangu.interpreter.context.Context;
import ge.edu.sangu.interpreter.interfaces.Expression;

public class Interpreter {
    private final Context context;

    public Interpreter(Context context) {
        this.context = context;
    }

    public double interpret(Expression expressionTree) {
        return expressionTree.interpret(context);
    }
}
