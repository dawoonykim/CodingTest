package Number;

public class SolutionN6 {
    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage += (int) (usage * change[i] / 100.0);

            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        SolutionN6 s6 = new SolutionN6();
        System.out.println(s6.solution(5141,500, new int[]{10, -10, 10, -10, 10, -10, 10, -10, 10, -10}));
        System.out.println(s6.solution(1000,2000, new int[]{-10,25,-33}));
    }
}