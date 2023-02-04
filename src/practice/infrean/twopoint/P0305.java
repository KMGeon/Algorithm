package practice.infrean.twopoint;

import java.util.Scanner;

public class P0305 {
    public int solution(int n1) {
        int answer=0;
        int m = n1/2+1;
        int[] arr = new int[m];
        int sum=0,rt=0,lt=0;
        for (int i=0;i<m;i++){
            arr[i] = i+1;
        }
        for (rt=0;rt<m;rt++) {
            sum+=arr[rt];
            if(sum==n1){
                answer++;
            }
            while (sum>=n1){
                sum-=arr[lt++];
                if(sum == n1){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        P0305 main = new P0305();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println(main.solution(n1));
    }
}
