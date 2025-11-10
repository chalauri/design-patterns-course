package ge.edu.sangu.interpreter;


import ge.edu.sangu.interpreter.context.Context;
import ge.edu.sangu.interpreter.expressions.*;
import ge.edu.sangu.interpreter.interfaces.Expression;

public class Main {

    public static void main(String[] args) {

        String inputExpression = "3 + 7 * 9 - 48 / 6";
        Expression expressionTree = buildExpressionTree(inputExpression);

        Interpreter interpreter = new Interpreter(new Context());
        double result = interpreter.interpret(expressionTree);

        System.out.println("Result = " + result);
    }

    // Let's assume method builds expression tree from String
    private static Expression buildExpressionTree(String expression) {
        // 3 + 7 * 9 - 48 / 6
        Expression multiplyExpr = new MultiplyExpression(new NumberExpression(7), new NumberExpression(9));

        Expression additionalExpr = new AdditionExpression(new NumberExpression(3), multiplyExpr);

        DivideExpression divideExpr = new DivideExpression(new NumberExpression(48), new NumberExpression(6));

        return new SubtractionExpression(additionalExpr, divideExpr);
    }
}
