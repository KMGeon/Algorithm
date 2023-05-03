package practice.infrean.part5;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        올바른괄호 main = new 올바른괄호();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));

    }

    private String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    return "No";
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "No";
        return answer;
    }
}
