package practice.자바알고리즘인터뷰.선형자료구조.배열;

//두 수의 합
//브루트 포스
public class p7_1 {
    public static void main(String[] args) {
        int[] nums = {2, 6, 11, 15};
        int target = 8;

        for (int i : p7_1.solution(nums, target)) {
            System.out.print(i);
        }

    }

    public static int[] solution(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
