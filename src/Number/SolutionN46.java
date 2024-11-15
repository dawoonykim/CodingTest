package Number;

import java.util.Arrays;

public class SolutionN46 {
    public static void main(String[] args) {
        SolutionN46 s45 = new SolutionN46();
        String result1 = Arrays.toString(s45.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}}));
        System.out.println(result1);
    }

    public int[] solution(int[] arr, int[][] queries) {

        int[] answer = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];
            int min = Integer.MAX_VALUE;

            for (int i = s; i <= e; i++) {
                // k보다 큰 값 중에 가장 작은 값 찾기
                if (arr[i] > k && arr[i] < min) {
                    min = arr[i];
                }
            }
            // min이 업데이트 되었는지 아닌지 판별하는 코드
            answer[q] = (min == Integer.MAX_VALUE) ? -1 : min;
        }

        return answer;
    }
}
