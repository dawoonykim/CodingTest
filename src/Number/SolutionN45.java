package Number;

import java.util.Arrays;

public class SolutionN45 {
    public static void main(String[] args) {
        SolutionN45 s45 = new SolutionN45();
        String result1 = Arrays.toString(s45.solution(new int[]{0,1,2,3,4},new int[][]{{0,3},{1,2},{1,4}}));
        System.out.println(result1);
    }

    public int[] solution(int[] arr, int[][] queries) {

        int[] answer = {};
        /*int tempi=0;
        int tempj=0;
        int temp;

        for (int i = 0; i < queries.length; i++) {

            for (int j = 0; j < queries[i].length; j++) {
                if (j == 0) {
                    tempi = queries[i][j];
                } else {
                    tempj = queries[i][j];
                }
            }
            temp = arr[tempi];
            arr[tempi] = arr[tempj];
            arr[tempj] = temp;

        }*/

        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        answer = arr.clone();

        return answer;
    }
}
