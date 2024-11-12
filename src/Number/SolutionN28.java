package Number;

public class SolutionN28 {
    public static void main(String[] args) {
        String[] arr = new String[] {"a", "b", "c"};
        SolutionN28 s28 = new SolutionN28();
        String result = s28.solution(arr);
        System.out.println(result);
    }

    public String solution(String[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}