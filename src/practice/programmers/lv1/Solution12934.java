package practice.programmers.lv1;

import java.util.Scanner;

public class Solution12934 {
    public long solution(long n) {
        long answer = -1;
        Long n1 = (long) Math.sqrt(n);
        if(n1 >0){
            answer = (long) Math.pow((n1+1),2);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution12934 main = new Solution12934();
        Scanner sc = new Scanner(System.in);
        Long n = (long) sc.nextInt();
        System.out.println("main.solution(n) = " + main.solution(n));
    }
}
