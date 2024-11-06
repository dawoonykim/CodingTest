package Number;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionN13 {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--; // 남쪽으로 이동
                    break;
                case 'E':
                    east++; // 동쪽으로 이동
                    break;
                case 'W':
                    east--; // 서쪽으로 이동
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }

    public static void main(String[] args) {
        SolutionN13 s13 = new SolutionN13();

        System.out.println(Arrays.toString(s13.solution("NSSNEWWN")));
        System.out.println(Arrays.toString(s13.solution("EESEEWNWSNWWNS")));
    }
}