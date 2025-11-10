package ge.edu.sangu.interpreter.expressions;

import ge.edu.sangu.interpreter.context.Context;
import ge.edu.sangu.interpreter.interfaces.Expression;

public class DivideExpression implements Expression {

    private final Expression firstExpression;
    private final Expression secondExpression;

    public DivideExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public double interpret(Context context) {
        if (Double.compare(secondExpression.interpret(context), 0) == 0) {
            throw new IllegalArgumentException("Division by 0 is not allowed");
        }

        return firstExpression.interpret(context) / secondExpression.interpret(context);
    }
}
