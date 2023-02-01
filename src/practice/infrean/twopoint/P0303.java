package practice.infrean.twopoint;

import java.util.Arrays;
import java.util.Scanner;

public class P0303 {
    public int solution(int mechulNum , int n1 , int[]arr){
        int answer=0;
        for (int i=n1;i<n1+n1;i++){
            answer+=arr[n1];
        }
        return answer;
    }
    public static void main(String[] args) {
        P0303 main = new P0303();
        Scanner sc = new Scanner(System.in);
        int mechulNum = sc.nextInt();
        int n1 = sc.nextInt();
        int[]arr = new int[mechulNum];
        for (int i = 0; i < n1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(mechulNum,n1,arr));
    }
}
