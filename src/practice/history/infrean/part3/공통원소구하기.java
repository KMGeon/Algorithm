package practice.history.infrean.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 공통원소구하기 {
    public static void main(String[] args) {
        공통원소구하기 main = new 공통원소구하기();
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr1[i] = sc.nextInt();
        }

        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int x : main.solution(num1, num2, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }

    private ArrayList<Integer> solution(int num1, int num2, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (p1 < num1 && p2 < num2) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1++]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return answer;
    }
}
