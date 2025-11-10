package ge.edu.sangu.interpreter.expressions;

import ge.edu.sangu.interpreter.context.Context;
import ge.edu.sangu.interpreter.interfaces.Expression;

public class NumberExpression implements Expression {

    private final double number;

    public NumberExpression(double number) {
        this.number = number;
    }

    @Override
    public double interpret(Context context) {
        return this.number;
    }
}
