package ge.edu.sangu.interpreter.expressions;

import ge.edu.sangu.interpreter.context.Context;
import ge.edu.sangu.interpreter.interfaces.Expression;

public class AdditionExpression implements Expression {

    private final Expression firstExpression;
    private final Expression secondExpression;

    public AdditionExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public double interpret(Context context) {
        return firstExpression.interpret(context) + secondExpression.interpret(context);
    }
}
