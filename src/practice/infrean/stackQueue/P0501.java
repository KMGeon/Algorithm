package practice.infrean.stackQueue;

import java.util.Scanner;
import java.util.Stack;

/*
stack은 LIFO last in first out , push(넣다) , pop() 꺼내다
Queue Fifo
 */
public class P0501 {
    public static void main(String[] args) {
        P0501 main = new P0501();
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
                    return "NO";
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            return "NO";
        }
        return answer;
    }
}
