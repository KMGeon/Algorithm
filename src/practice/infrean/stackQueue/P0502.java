package practice.infrean.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class P0502 {
    public static void main(String[] args) {
        P0502 main = new P0502();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(main.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop()!='(');//꺼낸 것을 return한다.
            }else {
                stack.push(x);
            }
        }
        for (int i=0;i<stack.size();i++){
            answer+=stack.get(i);
        }
        return answer;
    }
}
