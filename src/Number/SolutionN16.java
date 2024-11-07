package Number;

public class SolutionN16 {
    public static void main(String[] args) {
        SolutionN16 s16 = new SolutionN16();
        System.out.println(s16.solution(new String[]{"pencil", "pencil", "pencil", "book"}, new int[]{2, 4, 3, 1}));
        System.out.println(s16.solution(new String[]{"doll", "doll", "doll", "doll"}, new int[]{1, 1, 1, 1}));
        System.out.println(s16.solution(new String[]{"apple", "steel", "leaf", "apple", "leaf"}, new int[]{5, 3, 5, 3, 7}));
        System.out.println(s16.solution(new String[]{"mirror", "net", "mirror", "net", "bottle"}, new int[]{4, 1, 4, 1, 5}));
    }

    public String solution(String[] storage, int[] num) {
        int num_item = 0; // 개수 세기 위한 변수
        String[] clean_storage = new String[storage.length]; // 물건을 합침
        // String[] clean_storage = new String[4];
        int[] clean_num = new int[num.length]; // 물건을 합쳐서 보관한 숫자
        // int[] clean_num = new int[4];

        for (int i = 0; i < storage.length; i++) {
            // for (int i = 0; i < 4; i++) {
            int clean_idx = -1; // 몇 번째 index에 특정 물건이 저장되어 있는지 판단하는 index
            for (int j = 0; j < num_item; j++) {
                // for (int j = 0; j < 0; j++) {
                if (storage[i].equals(clean_storage[j])) {
                    // if (storage[i].equals(clean_storage[j])) {
                    clean_idx = j;
                    break;
                }
            }
            if (clean_idx == -1) {
                clean_storage[num_item] = storage[i];
                // clean_storage[0] = Integer.toString(num[i]);
                // => 새로운 storage에 겹치는 물건을 새롭게 저장을 해야 되는데, 기존 코드에서는 숫자를 저장하고 있었음
                clean_num[num_item] = num[i];
                // clean_num[0] = num[i];
                num_item += 1;
            } else {
                clean_num[clean_idx] += num[i];
            }
        }

        // 아래 코드에는 틀린 부분이 없습니다.

        int num_max = -1;
        String answer = "";
        for (int i = 0; i < num_item; i++) {
            if (clean_num[i] > num_max) {
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        System.out.println(num_max);
        return answer;
    }
}