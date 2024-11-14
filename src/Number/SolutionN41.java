package Number;

public class SolutionN41 {
    public static void main(String[] args) {
        SolutionN41 s41 = new SolutionN41();
        int result1 = s41.solution(new int[]{3, 4, 5, 2, 1});
        System.out.println(result1);
        int result2 = s41.solution(new int[]{5, 7, 8, 3});
        System.out.println(result2);


    }

    public int solution(int[] num_list) {

        String odd="";
        String even = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1) {
                odd += num_list[i];
            }else {
                even += num_list[i];
            }
        }

        return Integer.parseInt(odd)+Integer.parseInt(even);
    }

}
