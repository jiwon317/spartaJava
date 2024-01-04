package week02.operator;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        boolean flag = true;
        char alphabet = 'A';
        byte byteNumber = 123;
        short shortNumber = 32767;
        int intNumber = 2147483647;
        long longNumber = 2147483647L;
        float floatNumber = 0.123F;
        double doubleNumber = 0.1231231;
        String helloWorld = "hello world";
        int[] a ={1,2,3};
        int number = 21;
        Integer num = number; // boxing

        System.out.println(num.intValue()); // unboxing

        System.out.println(Arrays.toString(a));
        System.out.println(helloWorld);
        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(intNumber);
        System.out.println(longNumber);
        System.out.println(alphabet);
        System.out.println(flag);
    }
}
