package week02.operator;

public class main2 {
    public static void main(String[] args) {
        // 변수 타입별 크기순서
        // byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)

        //(1) byte -> int
//        byte byteNumber = 10;
//        int intNumber = byteNumber;
//        System.out.println(intNumber);
//
//        // (2) char( 1byte) -> int(4) 형변환
//        char charAlphabet = 'A';
//        intNumber = charAlphabet; // char -> int로 자동 형변환
//        System.out.println(intNumber);

        // (3) int -> long number 형변환
//        intNumber = 100;
//        long longNumber = intNumber;
//        System.out.println(longNumber);

        //(4) int -> double 형 변환
//        intNumber = 200;
//        double doubleNumber = intNumber;
//        System.out.println(doubleNumber);

        // 작은 크기의 타입이 큰 크기의 타입과 '계산'일 때,
        // 자동으로 큰 크기의 타입으로 형 변환이 됩니다.
        int intNumber = 10;
        double doubleNumber = 5.5;
        double result = intNumber + doubleNumber;
        System.out.println("plus -> " + result);

        // 1) 정수로 나누기
        int iResult = intNumber / 4;
        // 2) 실수로 나누기
        double dResult = intNumber / 4.0;

        System.out.println(iResult + " / " + dResult);
    }
}
