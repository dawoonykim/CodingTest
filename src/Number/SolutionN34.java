package Number;

public class SolutionN34 {
    public static void main(String[] args) {
        int num1 = 7;

        int num2 = 10;

        SolutionN34 s34 = new SolutionN34();

        int result1 = s34.solution(num1);
        System.out.println(result1);
        int result2 = s34.solution(num2);
        System.out.println(result2);
    }

    public int solution(int n) {

        int answer = 0;

        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    answer += i;
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += Math.pow(i, 2);
                }
            }
        }
        return answer;
    }
}