package practice.programmers.solve;

public class 피보나치수열프로그래머스 {
    public static void main(String[] args) {
        피보나치수열프로그래머스 main = new 피보나치수열프로그래머스();
        int n = 5;
        System.out.println("main.solution(n) = " + main.solution(n));
    }

    private int solution(int n) {
        int a=1, b=1,c=0;
        for (int i = 2; i < n; i++) {
            c = (a + b) % 1234567;
            a=b;
            b=c;
        }
        return c;
    }

}
