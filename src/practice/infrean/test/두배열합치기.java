package practice.infrean.test;

import java.util.ArrayList;
import java.util.Scanner;

public class 두배열합치기 {
    public static void main(String[] args) {
        두배열합치기 main = new 두배열합치기();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
             arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for (java.lang.Object o : main.solution(n, m, arr1, arr2)) {
            System.out.println("o = " + o);
        }
    }

    private ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        return answer;
    }
}
