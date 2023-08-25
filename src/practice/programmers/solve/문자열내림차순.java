package practice.programmers.solve;


import java.util.Arrays;
import java.util.Scanner;

public class 문자열내림차순 {
    public static void main(String[] args) {
        문자열내림차순 main = new 문자열내림차순();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(main.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        answer = new StringBuilder(str).reverse().toString();

        return answer;
    }
}
