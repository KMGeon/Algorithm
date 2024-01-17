package practice.자바알고리즘인터뷰.선형자료구조.배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 브루드 포스로 풀면 시간 복잡도는 O(N^2)이다. 이걸 시간 복잡도를 더 최적화를 하려면 투 포인트로 해결이 가능하다.
public class p9_1 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -5};
        for (List<Integer> integers : p9_1.solution(nums)) {
            System.out.println("integers = " + integers);
        }
    }

    private static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        //-5, -1, -1, 0, 1, 2
        for (int i = 0; i < nums.length; i++) {

            if (i>0 && nums[i] == nums[i-1])continue;

            for (int j = i + 1; j < nums.length; j++) {

                if (j>i+1 && nums[j]==nums[j-1])continue;

                for (int k = j + 1; k < nums.length; k++) {

                    if (k>j+1 && nums[k]==nums[k-1])continue;

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }

                }
            }
        }

        return result;
    }
}
