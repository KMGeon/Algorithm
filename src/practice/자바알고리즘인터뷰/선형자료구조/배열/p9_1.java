package practice.자바알고리즘인터뷰.선형자료구조.배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        for (int i = 0; i < nums.length-2; i++) {

            for (int j = i + 1; j < nums.length - 1; j++) {

                for (int k = j + 1; j < nums.length; k++) {

                }
            }
        }


        return result;
    }
}
