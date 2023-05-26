package practice.programmers.lv2;

import java.util.Scanner;

public class JadenCase {
    public static void main(String[] args) {
        JadenCase main = new JadenCase();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }

    private String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.toLowerCase().split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                answer.append(firstChar).append(word.substring(1)).append(" ");
            }
        }

        return answer.toString().trim();
    }
}
