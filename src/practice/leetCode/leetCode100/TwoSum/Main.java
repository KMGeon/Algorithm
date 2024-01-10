package practice.leetCode.leetCode100.TwoSum;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;

        for (int num : Main.solution(nums, target)) {
            System.out.println("target = " + num);
        }
    }

    private static int[] solution(int[] nums, int target) {
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
