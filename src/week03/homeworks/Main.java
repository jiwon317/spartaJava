package week03.homeworks;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddOperation()
//                new AddOperation(),
//                new SubstractOperation(),
//                new MultiplyOperation(),
//                new DivideOperation()
        );
        System.out.println(calculator.calculate(15,3));
        calculator.setOperation(new AddOperation());
        System.out.println(calculator.calculate(10,3));
    }
}
