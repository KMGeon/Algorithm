package practice.infrean.part1;

import java.util.Scanner;

public class 두정수사이의합 {
    public static void main(String[] args) {
        두정수사이의합 main = new 두정수사이의합();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(main.solution(a, b));
    }

    private Long solution(int a, int b) {
        Long answer = 0L;

        if (a < b) {
            int tmp = b - a;
            for (int i = 1; i <= tmp; i++) {
                if (i == 1) {
                    answer += a;
                }
                answer += a + i;
            }
        }

        if (a > b) {
            int tmp = a - b;
            for (int i = 1; i <= tmp; i++) {
                if (i == 1) {
                    answer += a;
                }
                answer += a - i;
            }
        }

        return answer;
    }
}
