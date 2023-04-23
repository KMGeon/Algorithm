package review.string;

import java.util.Scanner;
/*
숫자만 출력하고 싶으면 (Character.isDigit(c))
 */
public class P0109 {
    public String solution(String str){
        String answer="";
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)){
                answer+=c;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        P0109 main = new P0109();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
