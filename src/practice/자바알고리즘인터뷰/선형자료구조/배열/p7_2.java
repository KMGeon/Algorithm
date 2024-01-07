package practice.자바알고리즘인터뷰.선형자료구조.배열;

// 두 수의 합

import java.util.HashMap;
import java.util.Objects;

/**
 * 두 수의 합
 * 1. 기존의 브루드 포스를 더 최적화를 하기 위해서는 어떻게 해야되는지 고민
 *
 * hashmap으로 평균적으로 조회는 o(1)이다. 최악의 경우 o(n)이다.
 * 기본적으로 o(n)으로 처리할 수 있어 브루드 포스의 o(n^2)보다 빠르게 처리할 수 있다.
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
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        int numsLength = nums.length;

        for (int i = 0; i < numsLength; i++) map.put(nums[i],i);

        /*
         * needsNumber를 통하여 원하는 value를 찾을 수 있다.
         * value가 key에 있기 때문에 containKey를 통하여 참, 거짓을 판단
         * 현재 인덱스가 아닌 경우에 정답으로 리턴한다.
         */
        /*
         * i != map.get(needNumber)를 처리하는 이유는 자기 자신을 처리하지 않기 때문이다.
         */
        for (int i = 0; i < numsLength; i++) {
            int needNumber =  target - nums[i];
            System.out.println(needNumber);
            System.out.printf("{%s}",needNumber);
            if (map.containsKey(needNumber) && i != map.get(needNumber)) return new int[]{i, map.get(needNumber)};
        }

        return null;
    }

}
