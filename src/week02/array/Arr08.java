package week02.array;

public class Arr08 {
    public static void main(String[] args) {
        // 최소값,최댓값 구하기
        int[] arr = {2,1,3,5,7};

        // 최대값 초기화 세팅
        int max = arr[0];

        // 최소값 초기화 세팅
        int min = arr[0];

        // 최대값 구하기 로직
        for(int num:arr) {
            if(num >= max) {
                max = num;
            }
        }

        // 최소값 구하기 로직
        for(int num:arr) {
            if(num < min) {
                min = num;
            }
        }
        System.out.println("최대값 -> " + max);
        System.out.println("최소값 -> " + min);
    }
}
