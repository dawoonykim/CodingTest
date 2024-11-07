package Number;

import java.util.Scanner;

public class SolutionN20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (Character.isLowerCase(b)) {
                // 글자가 소문자인지 확인
                answer += Character.toUpperCase(b);
                // 글자를 대문자로 변경 후 answer에 저장
            } else if (Character.isUpperCase(b)) {
                // 글자가 대문자인지 확인
                answer += Character.toLowerCase(b);
                // 글자를 소문자로 변경 후 answer에 저장
            }
        }

        System.out.println(answer);
    }
}