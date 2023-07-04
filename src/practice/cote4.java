package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Level;

public class cote4 {
    public static void main(String[] args) {
        cote4 main = new cote4();
        int[] arr = {5, 3, 9, 13};
        int n=7;

        System.out.println(main.solution(arr,n));
    }

    private boolean solution(int[] arr, int n) {
        if (arr.length < 2) {
            return false;
        }

        Arrays.sort(arr);

        int lt = 0;
        int rt = arr.length-1;

        while (lt < rt) {
            int sum = arr[lt]+arr[rt];

            if (sum == n) {
                return true;
            } else if (sum < n) {
                lt++;
            }else {
                rt--;
            }
        }

        return false;
    }
}
