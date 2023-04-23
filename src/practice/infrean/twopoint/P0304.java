package practice.infrean.twopoint;

import java.util.Scanner;

public class P0304 {
    public int solution(int n1 , int n2 , int[]arr){
        int answer = 0;
        int sum=0;
        int rt=0,lt=0;
        for (rt=0;rt<n1;rt++){
            sum+=arr[rt];
            if(sum==n2){
                answer++;
            }
            while (sum>=n2){//만약에 하나 빼고 n2값과 다를 수 있어서 while
                sum-=arr[lt++];
                if(sum==n2){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        P0304 p0304 = new P0304();
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(p0304.solution(n1,n2,arr));
    }
}
