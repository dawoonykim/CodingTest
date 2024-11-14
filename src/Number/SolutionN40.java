package Number;

public class SolutionN40 {
    public static void main(String[] args) {
        SolutionN40 s40 = new SolutionN40();
        int result1 = s40.solution(new int[]{3, 4, 5, 2, 1});
        System.out.println(result1);
        int result2 = s40.solution(new int[]{5, 7, 8, 3});
        System.out.println(result2);


    }

    public int solution(int[] num_list) {

        int multiple = num_list[0];
        int sum = num_list[0];


        for (int i = 1; i < num_list.length; i++) {
            multiple *= num_list[i];
            sum += num_list[i];
        }

        int multiplePow = (int) Math.pow(sum, 2);

        if (multiple > multiplePow) {
            return 0;
        } else {
            return 1;
        }
    }

}
// 3 15 19