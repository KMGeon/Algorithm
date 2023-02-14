package practice.infrean.sortingAndSearching;

import java.util.Scanner;

public class P0604 {
    public static void main(String[] args) {
        P0604 main = new P0604();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : main.solution(n1, n2, arr)) {
            System.out.println(i + " ");
        }
    }

    private int[] solution(int n1, int n2, int[] arr) {
        int[] cache = new int[n1];
        for (int i : cache) {
            int pos = -1;

        }
        return new int[0];
    }
}
