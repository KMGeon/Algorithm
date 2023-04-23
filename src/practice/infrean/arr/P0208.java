package practice.infrean.arr;

import java.util.ArrayList;
import java.util.Scanner;

public class P0208 {
    public int[] solution(int n , int[] arr) {
        int[] answer = new int[n];
        for(int i=0; i<n; i++) {
            int cnt = 1;
            for(int j=0;j<n;j++){
                if(arr[j]>arr[i]){
                    cnt++;
                }
                answer[i] = cnt;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P0208 p0208 = new P0208();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i : p0208.solution(n,num)) {
            System.out.print(i+" ");
        }
    }
}
