package practice.livecCoding;

import java.util.Scanner;

public class 피보나치수열_배열 {

    public static void main(String[] args) {
        피보나치수열_배열 main = new 피보나치수열_배열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : main.solution(n)) {
            System.out.print(x+" ");
        }
    }

    private int[] solution(int n) {
        int [] answer =new int[n];
        answer[0] = 1;
        answer[1]  =1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }

}
