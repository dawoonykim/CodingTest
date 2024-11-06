package Number;

import java.util.Scanner;

public class SolutionN10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int c = scanner.nextInt();

        int b_square = c*c - a*a;
        int b = (int) (Math.pow(c,2) - Math.pow(a,2)); // b^2=c^2-a^2

        System.out.println(b_square);
        System.out.println(b);
    }
}