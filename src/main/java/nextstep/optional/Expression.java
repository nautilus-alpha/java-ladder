package nextstep.optional;

import java.util.Arrays;

enum Expression {
    PLUS("+"), MINUS("-"), TIMES("*"), DIVIDE("/");

    private final String expression;

    Expression(String expression) {
        this.expression = expression;
    }

    private static boolean matchExpression(Expression e, String expression) {
        return expression.equals(e.expression);
    }

    static Expression of(String expression) {
        return Arrays.stream(Expression.values())
                .filter(e -> matchExpression(e, expression))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
