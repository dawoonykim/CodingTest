package Number;

public class SolutionN43 {
    public static void main(String[] args) {
        SolutionN43 s43 = new SolutionN43();
        int result1 = s43.solution(0,"wsdawsdassw");
        System.out.println(result1);



    }

    public int solution(int n, String control) {
        String[] split = control.split("");

        for (int i = 0; i < control.length(); i++) {
            if (split[i].equals("w")) {
                n += 1;
            } else if (split[i].equals("s")) {
                n -= 1;
            } else if (split[i].equals("d")) {
                n += 10;
            } else if (split[i].equals("a")) {
                n -= 10;
            }
        }

        return n;
    }

}
