package practice.infrean.sortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P0606 {
    public static void main(String[] args) {
        P0606 main = new P0606();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : main.solution(n,arr)) {
            System.out.print(i+" ");
        }
    }

    private ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[]tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i=0;i<n;i++){
            if(arr[i]!=tmp[i]){
                answer.add(i+1);
            }
        }
        return answer;
    }
}
