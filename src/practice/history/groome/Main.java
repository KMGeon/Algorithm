package practice.history.groome;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int[] arr = {4, -6, 3, 2, -7};

        int[] result = main.solution(arr);

        System.out.println(result[0]+",");
        System.out.println(result[1]);
    }

    private int[] solution(int[] arr) {

        Arrays.sort(arr);

        int num1 = arr[arr.length - 1] * arr[arr.length - 2];
        int num2 = arr[0] * arr[1];

        if (num1 >= num2) {
            return new int[]{arr[arr.length - 1], arr[arr.length - 2]};
        } else {
            return new int[]{arr[0], arr[1]};
        }

    }
}
