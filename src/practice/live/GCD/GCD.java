package practice.live.GCD;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        GCD main = new GCD();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b > a) {
            int temp = b;
            b = a;
            a = temp;
        }
        int result = gcd(a, b);
        System.out.println(result);
        System.out.println(a*b/result);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
