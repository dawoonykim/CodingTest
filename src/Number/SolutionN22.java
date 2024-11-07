package Number;

import java.util.Scanner;

public class SolutionN22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + "+" + b + " = " + (a + b));
        // a + b를 a + "+" + b + " = " + (a + b) 이런 방법으로 수정
        // 단 a와 b를 더한 값이 문자로 인식이 되기 때문에 괄호를 치는 것이 중요
    }
}