package practice.history.programmers.solve;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        올바른괄호 main = new 올바른괄호();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }

    private boolean solution(String str) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[0]);

        }

        return answer;
    }
}
