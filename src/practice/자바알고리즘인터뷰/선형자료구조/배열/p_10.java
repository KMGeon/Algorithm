package practice.자바알고리즘인터뷰.선형자료구조.배열;

import java.util.Arrays;

public class p_10 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2};
        System.out.println(p_10.solution(nums));
    }

    private static int solution(int[] nums) {

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        Arrays.sort(nums);

        min = Math.min(nums[0], nums[1]);
        System.out.println(min);
        max = Math.min(nums[nums.length-1], nums[nums.length-2]);

        return min +max;
    }
}
