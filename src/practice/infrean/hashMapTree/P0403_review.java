package practice.infrean.hashMapTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class P0403_review {
    public static void main(String[] args) {
        P0403_review main = new P0403_review();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : main.solution(n1, n2, arr)) {
            System.out.println("i = " + i+" ");
        }
    }

    private ArrayList<Integer> solution(int n1, int n2, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n2 - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = n2 - 1; rt < n1; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (arr[lt] == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }
        return answer;
    }
}
