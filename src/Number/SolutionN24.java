package Number;

import java.util.Scanner;

public class SolutionN24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] chars = new char[a.length()];
        // 문자를 문자열로 저장하기 위한 배열 선언

        for (int i = 0; i < a.length(); i++) {
            chars[i] = a.charAt(i);
            // 문자를 글자로 분해해서 각 배열마다 저장

            System.out.println(chars[i]);
            // 배열마다 저장된 글자를 \n으로 나눠서 출력
        }
    }
}