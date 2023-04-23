package review.string;

import java.util.Scanner;

/**
 * 아스키 번호로 수행하면
 * 65~90 : 대문자
 * 97~122 : 소문자
 */
public class P0102_2 {
    public String solution(String s1) {
        String answer = "";
        char[] chars = s1.toCharArray();
        for (char c : chars) {
            if (c >= 97 && c <= 122) answer += (char)(c-32); //소문자
            else answer += (char)(c+32);//대문자
        }
        return answer;
    }

    public static void main(String[] args) {
        P0102_2 main = new P0102_2();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println("main.solution(s1) = " + main.solution(s1));
    }
}
