package practice.infrean.hashMapTree;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class P0405 {
    public static void main(String[] args) {
        P0405 main = new P0405();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(main.solution(arr,n,k));
    }

    private int solution(int[] arr, int n, int k) {
        int answer=-1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++){
                for(int l=j+1;l<n;l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt=0;
        for (int x:Tset){
            cnt++;
            if(cnt==k){
                return x;
            }
        }
        return answer;
    }
}
