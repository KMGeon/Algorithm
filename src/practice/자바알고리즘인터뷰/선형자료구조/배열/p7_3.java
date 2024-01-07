package practice.자바알고리즘인터뷰.선형자료구조.배열;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class p7_3 {

    public static void main(String[] args) {
        int[] nums = {2, 6, 11, 15};
        int target = 8;

        for (int i : Objects.requireNonNull(p7_3.solution(nums, target))) {
            System.out.print(i);
        }
    }

    private static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needNumbs = target - nums[i];

            if (map.containsKey(needNumbs)) return new int[]{needNumbs, i};

            map.put(nums[i], i);
        }
        return null;
    }

}

