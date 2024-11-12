package Number;

public class SolutionN32 {
    public static void main(String[] args) {
        int num1 = 98;
        int n1 = 2;

        int num2 = 34;
        int n2 = 3;

        SolutionN32 s32 = new SolutionN32();

        int result1 = s32.solution(num1, n1);
        System.out.println(result1);
        int result2 = s32.solution(num2, n2);
        System.out.println(result2);
    }

    public int solution(int num, int n) {

        if (num % n == 0) {

            return 1;
        } else {
            return 0;
        }

    }
}