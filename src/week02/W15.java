package week02;

public class W15 {
    public static void main(String[] args) {
        // for 문
        // (초기값; 조건문; 증가연산)
//        for(int i = 0; i < 4; i++) {
//            System.out.println(i + "번째 출력!");
//        }

        // 향상된 for문
        // 기존 : for문 안에 3개의 표현이 들어가죠 -> (초기값; 조건문; 증가연산)
        // 향상된 for문 : 2개로 줄여줌
        int[] numbers = {1,2,3,4,5};
        for(int number: numbers) {
            System.out.print(number);
//        }
//        int[] numbers = {3, 6, 9, 12, 15};
//        for(int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
        }
    }
}
