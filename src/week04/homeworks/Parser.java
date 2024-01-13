package week04.homeworks;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws Exception {
        // 정규식 체크
        if (Pattern.matches(NUMBER_REG, firstInput)) {
            throw new BadInputException("정수값");
        }
        // 구현 1.
        this.calculator.setFirstNumber(Integer.parseInt(firstInput));
    }

    public Parser parseSecondNum(String secondInput) {
        // 구현 1.
    }

    public Parser parseOperator(String operationInput) {
        // 구현 1.
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
