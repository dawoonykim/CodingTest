package Number;

public class SolutionN33 {
    public static void main(String[] args) {
        int num1 = 60;
        int n1 = 2;
        int m1 = 3;

        int num2 = 55;
        int n2 = 10;
        int m2 = 5;

        SolutionN33 s33 = new SolutionN33();

        int result1 = s33.solution(num1, n1, m1);
        System.out.println(result1);
        int result2 = s33.solution(num2, n2, m2);
        System.out.println(result2);
    }

    public int solution(int num, int n, int m) {

        if (num % n == 0 && num % m == 0) {
            return 1;
        } else {
            return 0;
        }

    }
}