package practice.programmers.solve;

import java.util.ArrayList;

public class 제일작은수제거 {
    public static void main(String[] args) {
        제일작은수제거 main = new 제일작은수제거();
        int[] arr = {10};
        System.out.println(main.solution(arr));
    }

    private ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int tmp = Integer.MAX_VALUE;

        for (int x : arr) {
            if (tmp > x) {
                tmp = x;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tmp) {
                list.add(arr[i]);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }
        return list;
    }
}
