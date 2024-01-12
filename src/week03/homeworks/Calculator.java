package week03.homeworks;

public class Calculator {

    private AbstractOperation operation;

//    private final AddOperation addOperation;
//    private final SubstractOperation substractOperation;
//    private final MultiplyOperation multiplyOperation;
//    private final DivideOperation divideOperation;

    public Calculator (AbstractOperation operation) {

//    public Calculator (AddOperation addOperation,
//                       SubstractOperation substractOperation,
//                       MultiplyOperation multiplyOperation,
//                       DivideOperation divideOperation) {

        this.operation = operation;
//        this.addOperation = addOperation;
//        this.substractOperation = substractOperation;
//        this.multiplyOperation = multiplyOperation;
//        this.divideOperation = divideOperation;

    }
    public void setOperation (AbstractOperation operation) {
        this.operation = operation;
    }
    public double calculate(int fitstNumber, int secondNumber) {
        double answer = 0;

        answer = operation.operate(fitstNumber, secondNumber);

//        if (operator.equals("+")) {
//            // 더하기 연산
//            answer = addOperation.operate(fitstNumber, secondNumber);
//        } else if (operator.equals("-")) {
//            // 빼기 연산
//            answer = substractOperation.operate(fitstNumber, secondNumber);
//        } else if (operator.equals("*")) {
//            // 곱하기 연산
//            answer = multiplyOperation.operate(fitstNumber, secondNumber);
//        } else if (operator.equals("/")) {
//            // 나누기 연산
//            answer = divideOperation.operate(fitstNumber, secondNumber);
//        } else if(operator.equals("%")) {
//            answer = fitstNumber % secondNumber;
//        }
//
        return answer;

    }
}
