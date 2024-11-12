package Number;

public class SolutionN35 {
    public static void main(String[] args) {
        String ineq1 = "<";
        String eq1 = "=";
        int n1 = 20;
        int m1 = 50;

        String ineq2 = ">";
        String eq2 = "!";
        int n2 = 41;
        int m2 = 78;

        SolutionN35 s35 = new SolutionN35();

        int result1 = s35.solution(ineq1, eq1, n1, m1);
        System.out.println(result1);

        int result2 = s35.solution(ineq2, eq2, n2, m2);
        System.out.println(result2);
    }

    public int solution(String ineq, String eq, int n, int m) {


        // '>=', '>', '>!→ <', '<!→ >', '<='

        String str = ineq + eq;

        if (str.equals(">=")) {
            return n >= m ? 1 : 0;
            // n >= m 이 맞으면 1 아니면 0
        } else if (str.equals(">!")) {
            return n > m ? 1 : 0;
        } else if (str.equals("<=")) {
            return n <= m ? 1 : 0;
        } else if (str.equals("<!")) {
            return n < m ? 1 : 0;
        } else {
            return 0;
        }
    }
}