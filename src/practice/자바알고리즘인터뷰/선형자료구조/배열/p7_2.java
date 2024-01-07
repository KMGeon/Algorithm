package practice.자바알고리즘인터뷰.선형자료구조.배열;

// 두 수의 합

import java.util.HashMap;
import java.util.Objects;

/**
 * 두 수의 합
 * 1. 기존의 브루드 포스를 더 최적화를 하기 위해서는 어떻게 해야되는지 고민
 *
 */
public class p7_2 {

    public static void main(String[] args) {
        int[] nums = {2, 6, 11, 15};
        int target = 8;

        for (int i : Objects.requireNonNull(p7_2.solution(nums, target))) {
            System.out.print(i);
        }

    }

    private static int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) map.put(nums[i],i);

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i != map.get(target-nums[i])) {
                return new int[]{i,map.get(target-nums[i])};
            }
        }


        return null;
    }

}
