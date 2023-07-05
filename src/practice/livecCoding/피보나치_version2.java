package practice.livecCoding;

import java.util.Scanner;

public class 피보나치_version2 {
    public static void main(String[] args) {
        피보나치_version2 main = new 피보나치_version2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        main.solution(n);
    }

    private void solution(int n) {
        int a = 1, b = 1, c;
        System.out.print(a+" "+b+" ");

        for (int i = 2; i < n; i++) {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
