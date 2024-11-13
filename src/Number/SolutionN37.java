package Number;

public class SolutionN37 {
    public static void main(String[] args) {
        SolutionN37 s37 = new SolutionN37();
        String result = s37.solution("abc1abc1abc");
        System.out.println(result);
    }

    public String solution(String code) {
        String answer = "";
        StringBuilder sb= new StringBuilder();
        int mode = 0;
        String[] x = code.split("");

        for (int i = 0; i < code.length(); i++) {
            // System.out.println(x[i]);
            if (mode == 0) {
                if (i % 2 == 0) {
                    if (!x[i].equals("1")) {
                        sb.append(x[i]);
                    }
                }
                if (x[i].equals("1")) {
                    mode += 1;
                }
            } else if (mode == 1) {
                if (i % 2 != 0) {
                    if (!x[i].equals("1")) {
                        sb.append(x[i]);
                    }
                }
                if (x[i].equals("1")) {
                    mode -= 1;
                }
            }
        }

        return sb.length() > 0 ? sb.toString() : "EMPTY";
    }

}