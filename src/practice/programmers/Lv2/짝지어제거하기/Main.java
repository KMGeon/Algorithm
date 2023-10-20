package practice.programmers.Lv2.짝지어제거하기;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        String s = "baabaa";

        System.out.println(main.solution(s));
    }

    private int solution(String s) {
        int answer = 0;
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : charArray) {
            if (!stack.isEmpty() && stack.peek() == c) { // peek 값을 가져와서 비교하도록 수정
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) { // 모든 문자를 제거했으면 1을 반환
            answer = 1;
        }

        return answer;
    }
}





