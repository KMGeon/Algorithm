package practice.infrean.part5;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {
    public static void main(String[] args) {
        괄호문자제거 main = new 괄호문자제거();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));
    }

    private String solution(String str) {
        String answer="";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x != ')') {
                stack.push(x);
            } else {
                if (stack.pop() != '(') {
                    stack.pop();
                }
            }
        }
        System.out.println(stack);

        return answer;
    }
}
