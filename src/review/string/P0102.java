package review.string;

import java.util.Scanner;

public class P0102 {
    public String solution(String s1){
        String answer="";
        char[] chars = s1.toCharArray();
        for (char c : chars) {
            if (Character.isUpperCase(c))answer+=Character.toLowerCase(c);
            else if (Character.isLowerCase(c))answer+=Character.toUpperCase(c);
        }
        return answer;
    }
    public static void main(String[] args) {
        P0102 main = new P0102();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println("main.solution(s1) = " + main.solution(s1));
    }
}
