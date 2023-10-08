package practice.history.infrean.part1;

import java.util.Scanner;

public class 회문문자열 {
    public static void main(String[] args) {
        회문문자열 main = new 회문문자열();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        String str1 = str.toUpperCase();
        StringBuilder str2 = new StringBuilder(str.toUpperCase()).reverse();
        if (str1.equals(String.valueOf(str2))) {
            return "YES";
        }
        return "NO";
    }
}
