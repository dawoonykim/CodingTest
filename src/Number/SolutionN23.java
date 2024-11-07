package Number;

import java.util.Scanner;

public class SolutionN23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);
        System.out.println(sb);
        // 문자를 하나씩 이어 붙이는 방법

        System.out.println(a+b);
        // 출력할 때 문자를 더하면 두 문자가 하나의 문자로 출력이 된다
    }
}