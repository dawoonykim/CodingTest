package Number;

public class SolutionN15 {
    public static void main(String[] args) {
        SolutionN15 s17 = new SolutionN15();

        System.out.println(s17.solution("auto", 23, 45));
        System.out.println(s17.solution("target", 41, 40));
        System.out.println(s17.solution("minimum", 10, 34));
    }

    public int func1(int humidity, int val_set) {
        if (humidity < val_set) // 습도가 설정값 미만일 경우 : 3단계
            return 3;
        return 1; // 습도가 설정값 이상일 경우 : 1단계
    }

    public int func2(int humidity) {
        if (humidity >= 50) // 습도가 50 이상인 경우 : 0단계
            return 0;
        else if (humidity >= 40) // 습도가 40 이상 50 미만인 경우 : 1단계
            return 1;
        else if (humidity >= 30) // 습도가 30 이상 40 미만인 경우 : 2단계
            return 2;
        else if (humidity >= 20) // 습도가 20 이상 30 미만인 경우 : 3단계
            return 3;
        else if (humidity >= 10) // 습도가 10 이상 20 미만인 경우 : 4단계
            return 4;
        else // 습도가 0 이상 10 미만인 경우 : 5단계
            return 5;
    }

    public int func3(int humidity, int val_set) {
        if (humidity < val_set)
            return 1; // 습도가 설정값 미만일 경우 : 1단계
        return 0; // 습도가 설정값 이상일 경우 : 0단계
    }

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if (mode_type.equals("auto")) {
            answer = func2(humidity);
        } else if (mode_type.equals("target")) {
            answer = func1(humidity, val_set);
        } else if (mode_type.equals("minimum")) {
            answer = func3(humidity, val_set);
        }

        return answer;
    }
}