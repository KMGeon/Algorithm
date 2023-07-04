package practice;

import java.util.HashMap;
import java.util.Scanner;

public class cote2 {
    public static void main(String[] args) {
        cote2 main = new cote2();
        int[] arr = {6, 1, 6, 6, 7, 5, 6, 7};
        System.out.println(main.solution(arr));
    }

    private int solution(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int count = arr.length/2;

        for (int num : map.keySet()) {
            if (map.get(num) > count) {
                return num;
            }
        }


        return -1;
    }


}
