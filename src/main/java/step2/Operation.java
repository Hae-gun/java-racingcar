package step2;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operation {
    PLUS(   "+", (a,b) -> a+b),
    MINUS(  "-", (a,b) -> a-b),
    MULIPLY("*", (a,b) -> a*b),
    DIVIDE( "/", (a,b) -> a/b),
    NULL(    "", (a,b) -> null);

    private String operator;
    private BiFunction<Integer,Integer,Integer> calculator;

    static public Operation of(String operator){
        return Arrays.stream(values()).filter(operation -> operation.operator.equals(operator))
                .findFirst().orElse(Operation.NULL);
    }

    Operation(String operator, BiFunction<Integer, Integer, Integer> calculator) {
        this.operator = operator;
        this.calculator = calculator;
    }

    public int calcuate(int num1, int num2){
        return calculator.apply(num1,num2);
    }
}
