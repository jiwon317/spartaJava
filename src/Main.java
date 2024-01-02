
//클래스
//public : (접근)제어자, public(공공의, 공통의)

public class Main {

//    JDK
//    (1) compiler : .java -> .class
//    (2) JRE
//    (3) JDB : 디버깅
//    () : 소괄호
//    {} : 중괄호
//    [] : 대괄호

//    main 메서드
//    자바 프로젝트(앱)는, 제일 먼저 클래스의 main 메서드를 실행시킨다.
//    JVM의 약속
//    static : 이 프로그램이 시작할 때 무조건 실행되는 녀석임을 표현

//    output
//    void : 메서드의 출력값의 데이터 타입
//    void : "아무것도 없다." -> 출력은 없다.

//    input
//    (String args[]) : 매개변수 자리, 데이터 타입
//
    public static void main(String[] args) {
        // 객체 : 특징(속성, 변수), 행동(메소드)
        // print -> 줄바꿈 X
        // println -> 줄바꿈 O
        // ln : line

        // 1.7
        // 2.3
        // 3.3.14
        // 4.JAVA
        System.out.println(7);
        System.out.println(3);
        System.out.println(3.14);
        System.out.println("JAVA");
    }
}