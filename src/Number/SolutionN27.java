package Number;

public class SolutionN27 {
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";

        SolutionN27 s27 = new SolutionN27();

        String result = s27.solution(str1, str2);

        System.out.println(result);
    }

    public String solution(String str1, String str2) {
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            answer += str1.substring(i, i + 1)+str2.substring(i,i+1);
            // 글자를 하나씩 분리해서 저장하는 코드
        }
        return answer;
    }
}