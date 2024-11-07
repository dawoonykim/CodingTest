package Number;

import java.util.Scanner;

public class SolutionN19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf(str);
        }
        System.out.println();
        // 반복문으로 실행
        int count = 0;
        while (count < n) {
            System.out.printf(str);
            count++;
        }
        // while문으로 반복 실행
    }
}