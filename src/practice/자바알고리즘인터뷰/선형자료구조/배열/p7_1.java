package practice.자바알고리즘인터뷰.선형자료구조.배열;

//두 수의 합
//브루트 포스

import java.util.Objects;

/**
 * 문제 해설
 * - 시간 복잡도 O(n^2)
 * - 브루드 포스는 모두 탐색해야 하기 때문에 비효율적이다.
 */
public class p7_1 {
    public static void main(String[] args) {
        int[] nums = {2, 6, 11, 15};
        int target = 8;

        for (int i : Objects.requireNonNull(p7_1.solution(nums, target))) {
            System.out.print(i);
        }

    }
    public static int[] solution(int[] nums, int target) {
        int[] returnNums = new int[2];

        int numsLength = nums.length;
        for (int i = 0; i < numsLength; i++) {
            for (int j = i + 1; j < numsLength; j++) {
                int numSum = nums[i] + nums[j];
                if (target == numSum){
                    returnNums[0] = i;
                    returnNums[1] = j;
                    return returnNums;
                }
            }
        }
        return null;
    }
}
