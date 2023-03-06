package practice.study;

import java.util.Scanner;

public class P12937 {

    public static void main(String[] args) {
        P12937 main = new P12937();
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        System.out.println(main.solution(nextInt));

    }

    private String solution(int nextInt) {
        String answer = "";
        if(nextInt%2==0){
            answer = "Even";
        }else answer="Odd";
        return answer;
    }
}
