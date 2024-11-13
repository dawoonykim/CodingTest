package Number;

public class SolutionN39 {
    public static void main(String[] args) {
        SolutionN39 s39 = new SolutionN39();
        int result1 = s39.solution(2, 6, 1);
        System.out.println(result1);
        int result2 = s39.solution(5, 3, 3);
        System.out.println(result2);
        int result3 = s39.solution(4, 4, 4);
        System.out.println(result3);


    }

    public int solution(int a, int b, int c) {

        int answer = 0;

        if (a != b && a != c && b != c) {
            answer += a + b + c;
        } else if ((a == b && (a != c || b != c)) || (a == c && (a != c || b != c)) || (b == c && (a != b || a != c))) {
            answer += ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        } else if (a == b && b == c) {
            answer += ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        }

        return answer;
    }

}
// 3 15 19