package week02.operator;

import java.util.Scanner;

public class sparta1_hw {
    public static void main(String[] args) {
//        String title = "백종원 돼지고기 김치찌개 만들기";
//        double doubleScore = 4.5;
//        String a = "돼지고기는 핏물을 빼주세요.";
//        String b = "잘익은 김치 한포기를 꺼내서 잘라주세요.";
//        String c = "냄비에 들기름 적당히 두르고 김치를 넣고 볶아주세요.";
//        String d = "다진마늘 한스푼, 설탕 한스푼 넣어주세요.";
//        String e = "종이컵으로 물 8 컵 부어서 센불에 끓여주세요.";
//        String f = "핏물 뺀 돼지고기를 넣어주세요.";
//        String g = "된장 반 스푼, 양파 반개, 청양고추 한개를 썰어서 넣어주세요.";
//        String h = "간장 두스푼반, 새우젓 두스푼, 고춧가루 두스푼만 넣어주세요.";
//        String i = "중불로 줄여서 오래 끓여주세요~!!";
//        String j = "마지막에 파 쏭쏭 썰어서 마무리하면 돼요^^";
//
//        int intScore;
//        intScore = (int)doubleScore;
//
//        System.out.println("["+" "+title+" "+"]");
//        System.out.println("별점"+" "+":"+" "+intScore);
//        System.out.println("1."+a);
//        System.out.println("2."+b);
//        System.out.println("3."+c);
//        System.out.println("4."+d);
//        System.out.println("5."+e);
//        System.out.println("6."+f);
//        System.out.println("7."+g);
//        System.out.println("8."+h);
//        System.out.println("9."+i);
//        System.out.println("10."+j);
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        float rate = sc.nextFloat();
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String input3 = sc.nextLine();
        String input4 = sc.nextLine();
        String input5 = sc.nextLine();
        String input6 = sc.nextLine();
        String input7 = sc.nextLine();
        String input8 = sc.nextLine();
        String input9 = sc.nextLine();
        String input10 = sc.nextLine();

        System.out.println("[" + title + "]");
        int intRate = (int) rate;
        double percetageRate = intRate * 100 / 5.0;
        System.out.println(percetageRate + "%");
        System.out.println("1. " + input1);
        System.out.println("2. " + input2);
        System.out.println("3. " + input3);
        System.out.println("4. " + input4);
        System.out.println("5. " + input5);
        System.out.println("6. " + input6);
        System.out.println("7. " + input7);
        System.out.println("8. " + input8);
        System.out.println("9. " + input9);
        System.out.println("10. " + input10);
    }
}
