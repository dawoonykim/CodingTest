package Number;

import java.util.Arrays;

public class SolutionN14 {
    public static void main(String[] args) {
        SolutionN14 s14 = new SolutionN14();
        System.out.println(Arrays.toString(s14.solution(new int[]{1}, new int[]{100}, new int[]{100, 80, 90, 84, 20})));
        System.out.println(Arrays.toString(s14.solution(new int[]{3, 4}, new int[]{85, 93}, new int[]{85, 92, 38, 93, 48, 85, 92, 56})));
    }

    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i]-1]) { //배열은 0부터 시작 따라서 numbers[i]-1 = 3-1 = 2번 위치의 값과 비교
                answer[i] = "Same";
            } else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}