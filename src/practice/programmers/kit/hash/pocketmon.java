package practice.programmers.kit.hash;

import java.util.HashMap;
import java.util.Scanner;

public class pocketmon {
    public static void main(String[] args) {
        pocketmon main = new pocketmon();
        int[] nums = {3,3,3,2,2,4};
        System.out.println(main.solution(nums));
    }

    private int solution(int[] nums) {
//        int answer = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int x : nums) {
//            map.put(x, map.getOrDefault(x, 0) + 1);
//        }
//        int tmp = 0;
//        for (Integer integer : map.keySet()) {
//            if (map.get(integer) > 0 && map.get(integer) > 1) {
//                tmp++;
//            }
//        }
//        for (Integer key : map.keySet()) {
//            if (map.get(key) == 1) {
//                tmp++;
//                break;
//            }
//        }
//        answer = tmp;
//        return answer;
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int maxNum = nums.length / 2;
        int numOfKinds = map.keySet().size();
        System.out.println("numOfKinds = " + numOfKinds);
        answer = Math.min(maxNum, numOfKinds);
        return answer;
    }
}
