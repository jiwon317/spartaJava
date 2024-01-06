package week02.operator;

import java.util.*;

public class spartaHw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String CollectionName = sc.next();
        String title = sc.nextLine();

        switch (CollectionName) {
            case "List":
                ArrayList<String> strList = new ArrayList<>();
                while(true) {
                    // 한 줄씩 입력 받아서 strList에 저장하게끔!!
                    String text = sc.nextLine();
                    if(Objects.equals(text, "끝")) {
                        break;
                    }
                    strList.add(text);
                }

                title = "[ List로 저장된 " + title + "]"; // 괄호로 감싼 제목
                System.out.println(title);
                // strList를 한줄씩 출력
                for(int i = 0; i < strList.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + strList.get(i));
                }
                break;
            case "Map":
                Map<Integer, String> strMap = new HashMap<>();
                int lineNumber = 1;

                while(true) {
                    // 한 줄씩 입력 받아서 strMap에 저장하게끔!!
                    String text = sc.nextLine();
                    if(Objects.equals(text, "끝")) {
                        break;
                    }
                    strMap.put(lineNumber++,text);
//                    strMap.put(lineNumber,text);
//                    lineNumber = lineNumber + 1;
                }

                title = "[ Map으로 저장된 " + title + "]"; // 괄호로 감싼 제목
                System.out.println(title);
                // strMap를 한줄씩 출력
                for(int i = 0; i < strMap.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + strMap.get(i+1));
                }
                break;
            case "Set":
                LinkedHashSet<String> strSet = new LinkedHashSet<>();

                while(true) {
                    // 한 줄씩 입력 받아서 strSet에 저장하게끔!!
                    String text = sc.nextLine();
                    if(Objects.equals(text, "끝")) {
                        break;
                    }
                    strSet.add(text);
                }

                title = "[ Set으로 저장된 " + title + "]"; // 괄호로 감싼 제목
                System.out.println(title);

                Iterator iterator = strSet.iterator();
                // strSet를 한 줄씩 출력
                for(int i = 0; i < strSet.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + iterator.next());
                }
                break;
            default:
                System.out.println("저장할 수 없는 자료구조입니다.");
        }
    }
}
