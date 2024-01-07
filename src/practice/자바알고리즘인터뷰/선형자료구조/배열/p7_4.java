package practice.자바알고리즘인터뷰.선형자료구조.배열;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 투포인트 사용하여 두 수의 합
 * 투 포인트의 시간 복잡도는 o(n)
 * 이 문제는 투포인트로 해결할 수 없다. 그 이유는 투 포인트는 주로 정렬된 입력값을 대상으로 한다.
 * Array.sort()를 통해서 정렬하게 된다면 인덱스가 꼬이게 된다.
 * 인덱스를 처리해야 되는 부분이 있으면 투 포인트 보다는 다른 방식으로 접근을 해야된다.
 */
public class p7_4 {
    public static void main(String[] args) {
        int[] nums = {2, 6, 11, 15};
        int target = 8;

        for (int i : Objects.requireNonNull(p7_4.solution(nums, target))) {
            System.out.print(i);
        }
    }

    private static int[] solution(int[] nums, int target) {

        int leftPoint = 0;
        int rightPoint = nums.length-1;

        while (leftPoint != rightPoint) {
            if (nums[leftPoint] + nums[rightPoint] < target) {
                leftPoint +=1;
            } else if (nums[leftPoint] + nums[rightPoint] > target) {
                rightPoint-=1;
            } else {
                return new int[]{leftPoint,rightPoint};
            }
        }
        return null;
    }
}
