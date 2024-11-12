package Number;

public class SolutionN29 {
    public static void main(String[] args) {
        String my_string1 = "string";
        String my_string2 = "love";
        SolutionN29 s29 = new SolutionN29();
        String result1 = s29.solution(my_string1, 3);
        System.out.println(result1);
        String result2 = s29.solution(my_string2, 10);
        System.out.println(result2);
    }

    public String solution(String my_string, int k) {

        String answer = "";
        /*for (int i = 0; i < k; i++) {
            answer += my_string;
        }*/
        int i = 0;
        while (i < k) {
            answer += my_string;
            i++;
        }
        return answer;
    }
}