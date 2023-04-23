package practice.infrean.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class P0504 {
    public static void main(String[] args) {
        P0504 main = new P0504();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(main.solution(str));
    }

    private int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)){
                stack.push(c-48);
            }else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(c=='+'){
                    stack.push(lt+rt);
                }else if(c=='-'){
                    stack.push(lt-rt);
                }else if(c=='*'){
                    stack.push(lt*rt);
                }else if(c=='/'){
                    stack.push(lt/rt);
                }
            }
        }
        return stack.get(0);
    }
}
