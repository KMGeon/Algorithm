package practice.programmers.lv2;

import java.util.Scanner;

public class 최대값과최소값 {
    public static void main(String[] args) {
        최대값과최소값 main = new 최대값과최소값();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        char[] strArr = str.toCharArray();

        char min = strArr[0];
        System.out.println(min);

        return answer;
    }
}
