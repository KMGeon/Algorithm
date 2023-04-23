package practice.infrean.part1;

import java.util.Scanner;

public class 문자찾기 {
    public static void main(String[] args) {
        문자찾기 main = new 문자찾기();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(main.solution(input, c));
    }

    private int solution(String input, char c) {
        int answer = 0;
        char[] inputCharArray = input.toUpperCase().toCharArray();
        char c1 = Character.toUpperCase(c);
        for (int i = 0; i < inputCharArray.length; i++) {
            if (inputCharArray[i] == c1) {
                answer++;
            }
        }

        return answer;
    }
}
//char를 tochararray하는 방법은 Character.toUpperCase