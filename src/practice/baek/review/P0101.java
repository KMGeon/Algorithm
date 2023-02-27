package practice.baek.review;

import java.util.Scanner;

public class P0101 {
    public static void main(String[] args) {
        P0101 main = new P0101();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char n1 = sc.next().charAt(0);

        System.out.println(main.solution(str, n1));
    }

    private int solution(String str, char n1) {
       int answer=0;

        String str1 = str.toUpperCase();
        n1 = Character.toUpperCase(n1);

        for (int i=0;i<str1.length();i++){
            if(str1.charAt(i)==n1){
                answer++;
            }
        }
        return answer;
    }
}
