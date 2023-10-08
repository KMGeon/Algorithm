package practice.history.programmers.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        나누어떨어지는숫자배열 main = new 나누어떨어지는숫자배열();
        int[] arr = {5, 9, 7, 10};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (Integer integer : main.solution(arr, num)) {
            System.out.println("integer = " + integer);
        }
    }

    public ArrayList<Integer> solution(int[] arr, int num) {
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(arr);

        for (int i : arr) {
            if (i % num == 0) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            list.add(-1);
        }

        return list;
    }
}
