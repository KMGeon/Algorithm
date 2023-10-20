package practice.programmers.Lv1;

import java.util.Scanner;

public class 문자열다루기기본 {
    public static void main(String[] args) {
        문자열다루기기본 main = new 문자열다루기기본();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }

    public boolean solution(String str) {
        for (char x : str.toCharArray()) {
            if (Character.isAlphabetic(x)) {
                return false;
            }
        }
        return true;
    }
}
