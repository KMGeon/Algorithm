package practice.baek.review;

import java.util.Scanner;

public class P0102 {
    public static void main(String[] args) {
        P0102 main = new P0102();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }

    private String solution(String str) {
        String answer="";
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)){
                answer+=Character.toUpperCase(c);
            }else {
                answer+=Character.toLowerCase(c);
            }
        }
        return answer;
    }
}
