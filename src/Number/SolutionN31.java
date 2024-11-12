package Number;

public class SolutionN31 {
    public static void main(String[] args) {
        int a1 = 2;
        int b1 = 91;

        int a2 = 91;
        int b2 = 2;

        SolutionN31 s31 = new SolutionN31();

        int result1 = s31.solution(a1, b1);
        System.out.println(result1);
        int result2 = s31.solution(a2, b2);
        System.out.println(result2);
    }

    public int solution(int a, int b) {

        int stringA = Integer.parseInt(String.valueOf(a) + b);
        int ab2 = 2 * a * b;

        return (stringA>ab2)?stringA:ab2;
    }
}