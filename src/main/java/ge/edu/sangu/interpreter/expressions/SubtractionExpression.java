package ge.edu.sangu.interpreter.expressions;

import ge.edu.sangu.interpreter.context.Context;
import ge.edu.sangu.interpreter.interfaces.Expression;

public class SubtractionExpression implements Expression {

    private final Expression expressionOne;
    private final Expression expressionTwo;

    public SubtractionExpression(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }

    @Override
    public double interpret(Context context) {
        return expressionOne.interpret(context) - expressionTwo.interpret(context);
    }
}
