package Number;

import java.util.Scanner;

public class SolutionN25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            // n을 2로 나눠서 나머지가 0이면
            System.out.println(n + " is even");
        } else {
            // n을 2로 나눠서 나머지가 1이면
            System.out.println(n + " is odd");
        }
    }
}