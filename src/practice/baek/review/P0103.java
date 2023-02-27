package practice.baek.review;

import java.util.Scanner;

public class P0103 {
    public static void main(String[] args) {
        P0103 main = new P0103();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(main.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;

        String[] s = str.split(" ");
        for (String s1 : s) {
            int len = s1.length();
            if (len > m) {
                m = len;
                answer = s1;
            }
        }
        return answer;
    }
}
