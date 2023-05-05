package practice.infrean.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class 두배열합 {
    public static void main(String[] args) {
        두배열합 main = new 두배열합();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];

        for (int i = 0; i < num2; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int x : main.solution(num, num2, arr, arr2)) {
            System.out.print(x + " ");
        }
    }

    private ArrayList<Integer> solution(int num, int num2, int[] arr, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;

        while (p1 < num && p2 < num2) {
            if (arr[p1] < arr2[p2]) {
                answer.add(arr[p1++]);
            } else answer.add(arr[p2++]);
        }

        while (p1 < num) answer.add(p1++);
        while (p2 < num2) answer.add(p2++);

        return answer;
    }
}
