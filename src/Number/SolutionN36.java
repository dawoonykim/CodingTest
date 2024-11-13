package Number;

public class SolutionN36 {
    public static void main(String[] args) {
        SolutionN36 s36 = new SolutionN36();
        int result1 = s36.solution(-4, 7, true);
        System.out.println(result1);
        int result2 = s36.solution(-4, 7, false);
        System.out.println(result2);
    }

    public int solution(int a, int b, boolean flag) {

        int result = 0;
        if (flag == true) {
            result = a + b;
        } else {
            result = a - b;
        }
        return result;
    }

}