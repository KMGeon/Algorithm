package practice.infrean.Day1;

import java.util.Scanner;
//입력값 받아서 대소문자 바꾸기
// 소문자 대문자 탐색은 isLowerCase
public class P0102 {
    public String solution(String str) {
        String answer="";
        for (char x : str.toCharArray()) {
            if(Character.isLowerCase(x)){
                answer+=Character.toUpperCase(x);
            }else {
                answer+=Character.toLowerCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P0102 d1 = new P0102();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println(d1.solution(text));
    }
}
