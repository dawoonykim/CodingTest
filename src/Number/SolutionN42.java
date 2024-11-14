package Number;

public class SolutionN42 {
    public static void main(String[] args) {
        SolutionN42 s42 = new SolutionN42();
        int[] result1 = s42.solution(new int[]{2, 1, 6});
        System.out.println(result1.toString());
        int[] result2 = s42.solution(new int[]{5, 2, 1, 7, 5});
        System.out.println(result2.toString());


    }

    public int[] solution(int[] num_list) {

        int count = 0;
        int result = 0;
        for (int i = 0; i < num_list.length - 1; i++) {
            count++;
        }
        int[] answer = new int[num_list.length + 1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);

        if (num_list[count] > num_list[count - 1]) {
            result = num_list[count] - num_list[count - 1];
        } else {
            result = 2 * num_list[count];
        }

        answer[num_list.length] = result;


        return answer;
    }

}
