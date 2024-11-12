package Number;

public class SolutionN30 {
    public static void main(String[] args) {
        int a1 = 9;
        int b1 = 91;

        int a2 = 89;
        int b2 = 8;

        SolutionN30 s30 = new SolutionN30();

        int result1 = s30.solution(a1, b1);
        System.out.println(result1);
        int result2 = s30.solution(a2, b2);
        System.out.println(result2);
    }

    public int solution(int a, int b) {

        int stringA = Integer.parseInt(String.valueOf(a) + b);
        int stringB = Integer.parseInt(String.valueOf(b) + a);
        // a와 b 중 하나를 문자로 바꿔서 순서대로 문자열로 저장한 후 숫자로 변환

        return (stringA > stringB) ? stringA : stringB;
    }
}