package practice.infrean.sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class P0605 {
    public static void main(String[] args) {
        P0605 main = new P0605();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n1, arr));
    }

    private String solution(int n1, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n1 - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return "D";
            }
        }
        return answer;
    }
}
