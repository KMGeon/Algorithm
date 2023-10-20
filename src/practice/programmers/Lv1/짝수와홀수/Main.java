package practice.programmers.Lv1.짝수와홀수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(main.solution(num));
    }

    private String solution(int num) {
        String answer = "";
        answer = (num%2==0) ? "Even":"Odd";
        return answer;

    }
}
