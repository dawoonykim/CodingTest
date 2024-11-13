package Number;

public class SolutionN38 {
    public static void main(String[] args) {
        SolutionN38 s38 = new SolutionN38();
        int result1 = s38.solution(3, 4, new boolean[]{true, false, false, true, true});
        System.out.println(result1);
        int result2 = s38.solution(7, 1, new boolean[]{false, false, false, true, false, false, false});
        System.out.println(result2);
    }

    public int solution(int a, int d, boolean[] included) {

        int answer = 0;
        int[] arr = new int[included.length];

        for (int i = 0; i < included.length; i++) {
            if (i == 0) {
                arr[i] = a;
            } else {
                arr[i] = arr[i - 1] + d;
            }

            if (included[i]==true) {
                answer += arr[i];
            }
        }

        return answer;
    }

}
// 3 15 19