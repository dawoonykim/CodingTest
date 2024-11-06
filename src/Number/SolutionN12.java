package Number;

import java.util.Scanner;

public class SolutionN12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += before; // 70만원이 될떄까지 추가
            month++;
        }
        while (money < 100) {
            money += after; // 100만원이 될때까지 추가
            month++;
        }

        System.out.println(month);
    }
}