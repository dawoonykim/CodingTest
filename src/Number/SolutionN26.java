package Number;

public class SolutionN26 {
    public static void main(String[] args) {
        SolutionN26 s26 = new SolutionN26();
        System.out.println(s26.solution("He11oWor1d", "lloWorl", 2));
        // 3글자를 제외하고 다 바뀌어야 함
        System.out.println(s26.solution("Program29b8UYP", "merS123", 7));
        // 7글자를 제외하고 다 바뀌어야 함
    }

    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        String[] myArr = my_string.split("");
        String[] overArr = overwrite_string.split("");

        /*for (int i = 0; i < s; i++) {
            answer += myArr[i];
        }
        for (int i = 0; i < overArr.length; i++) {
            myArr[i] = overArr[i];
            answer += myArr[i];
        }

        for (int i = s+ overArr.length; i < myArr.length; i++) {
            answer += myArr[i];
        }*/
        // 정답은 맞으나 코드가 복잡함

        answer += my_string.substring(0, s) + overwrite_string + my_string.substring(overwrite_string.length() + s);
        // my_string.substring(0, s)-> index=0~index=1 사이의 글자 선택, my_string.substring(overwrite_string.length()+s)-> index=overwrite_string.length()+s 이후의 글자 선택


   /*     answer += String.valueOf(my_string.length()-overwrite_string.length());
        answer += String.valueOf(my_string.length());
        answer += String.valueOf(overwrite_string.length());*/

        return answer;
    }
}