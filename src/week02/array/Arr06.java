package week02.array;

public class Arr06 {
    public static void main(String[] args) {
        // 반복문을 통한 초기화
        int[][] array = new int[2][3]; // 최초 선언

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.println("출력값 => " + i +","+j);
                array[i][j] = 0; // i,j는 위 노란색 박스 안에 있는 숫자를 의미하며, 인덱스라고 부릅니다.

            }
        }
    }
}
