package practice.history.infrean.part1;

import java.util.Scanner;

public class 대소문자 {
    public static void main(String[] args) {
        대소문자 main = new 대소문자();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(main.solution(input));

    }

    private String solution(String input) {
        String answer = "";
        char[] inputCharArray = input.toCharArray();
        for (char c : inputCharArray) {
            if (Character.toUpperCase(c) == c) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }

        return answer;
    }
}
