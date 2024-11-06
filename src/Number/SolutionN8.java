package Number;

public class SolutionN8 {
    public static void main(String[] args) {
        SolutionN8 s8 = new SolutionN8();
        System.out.println(s8.solution("WORLDworld"));
        System.out.println(s8.solution("GO"));
    }

    public String solution(String nickname) {
        String answer = "";
        for (int i = 0; i < nickname.length(); i++) {
            if (nickname.charAt(i) == 'l') {
                answer += "I";
            } else if (nickname.charAt(i) == 'w') {
                answer += "vv";
            } else if (nickname.charAt(i) == 'W') {
                answer += "VV";
            } else if (nickname.charAt(i) == 'O') {
                answer += "0";
            } else {
                answer += nickname.charAt(i);
            }
        }
        if (answer.length() < 3) {
            while(answer.length()<4){ // 글자수가 4가 될 때까지 반복
//            for (int i = 0; i < (4 - answer.length()); i++) {
                answer += "o";
            }
        }
        if (answer.length() > 8) {
            answer = answer.substring(0, 8);
        }
        return answer;
    }
}