package Number;

public class SolutionN44 {
    public static void main(String[] args) {
        SolutionN44 s44 = new SolutionN44();
        String result1 = s44.solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1});
        System.out.println(result1);
    }

    public String solution(int[] numLog) {

        String answer = "";

        for (int i = 1; i < numLog.length; i++) {

            int x = numLog[i] - numLog[i - 1];
            if (x == 1) {
                answer += "w";
            } else if (x == -1) {
                answer += "s";
            } else if (x == 10) {
                answer += "d";
            } else if (x == -10) {
                answer += "a";
            }
        }

        return answer;
    }
}
