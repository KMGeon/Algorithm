package practice.infrean.sortingAndSearching;

import java.util.Scanner;

public class P0601 {
    public static void main(String[] args) {
        P0601 main = new P0601();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : main.solution(n1, arr)) {
            System.out.print(i + " ");
        }
    }

    private int[] solution(int n1, int[] arr) {
        for (int i = 0; i < n1 - 1; i++) {
            int idx = i;
            for (int j = i+1; j < n1; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }
}
