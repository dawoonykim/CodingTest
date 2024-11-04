package Number;

import java.util.Scanner;

public class SolutionN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2; while(sum_angle>=360){
            sum_angle -= 360;}
        System.out.println(sum_angle);
    }
}