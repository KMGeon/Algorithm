package practice.infrean.hashMapTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class P0403 {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            hm.put(arr[rt], hm.getOrDefault(arr[rt], 0) + 1);
            answer.add(hm.size());
            hm.put(arr[lt], hm.get(arr[lt])-1);
            if (hm.get(arr[lt]) == 0) {
                hm.remove(arr[lt]);
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        P0403 main = new P0403();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : main.solution(n1,n2,arr)) {
            System.out.print(i);
        }
    }
}
