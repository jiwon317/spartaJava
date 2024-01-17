package week05.Thread.stat.sleep;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                // (1) 예외처리 필수!
                // - interrupt() 를 만나면 다시 실행되기 때문에
                // - InterruptedException이 발생할 수 있어요.
                // (2) 특정 쓰레드지목 불가
                Thread.sleep(2000); // TIMED_WAITING(주어진 시간동안만 기다리는 상태)
//                객체.메서드();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread"); // NEW
        thread.start(); // NEW -> RUNNABLE

        try {

            // 1초가 지나고 나면 runnable 상태로 변하여 다시 실행됨!
            // 특정 쓰레드를 지목해서 멈추게 하는 것은 불가능!
            // Static member 'java.lang.Thread.sleep(long)' accessed via instance reference
            thread.sleep(1000);
            // Thread.sleep(1000);
            System.out.println("sleep(1000) : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
