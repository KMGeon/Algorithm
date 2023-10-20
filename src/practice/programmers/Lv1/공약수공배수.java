package practice.programmers.Lv1;

public class 공약수공배수 {
    public static void main(String[] args) {
        공약수공배수 main = new 공약수공배수();

        int a = 3;
        int b = 12;

        for (int s : main.solution(a,b)) {
            System.out.println("s = " + s);
        }
    }

    private int[] solution(int a, int b) {
        if (b > a) {
            int temp = b;
            b= a;
            a =temp;
        }
        int result = gcd(a, b);
        int[]arr = {result,a*b/gcd(a,b)};
        return arr;
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
}

