package ge.edu.sangu.interpreter.interfaces;

import ge.edu.sangu.interpreter.context.Context;

public interface Expression {

    double interpret(Context context);
}
