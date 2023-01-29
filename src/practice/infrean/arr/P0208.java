package practice.infrean.arr;

import java.util.ArrayList;
import java.util.Scanner;

public class P0208 {
    public int[] solution(int a1 , int[] arr) {
        int[] answer = new int[a1];
        for(int i=0; i<a1; i++) {
            int cnt = 1;
            for(int j=0;j<a1;j++){
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
        int a1 = sc.nextInt();
        int[] num = new int[a1];
        for (int i = 0; i < a1; i++) {
            num[i] = sc.nextInt();
        }
        for (int i : p0208.solution(a1,num)) {
            System.out.print(i+" ");
        }
    }
}
