package Number;

import java.util.Scanner;
import java.util.Timer;

public class SolutionN11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) { // Korea가 입력될 때
            answer = 2030-year+1; // 한국나이 계산
        } else if (age_type.equals("Year")) { // Year가 입력될 때
            answer = 2030 - year; // 만 나이 계산
        }

        System.out.println(answer);
    }
}