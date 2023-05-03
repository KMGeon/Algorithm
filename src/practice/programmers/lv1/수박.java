package practice.programmers.lv1;

import java.util.Scanner;

public class 수박 {
    public static void main(String[] args) {
        수박 main = new 수박();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(main.solution(num));
    }

    public String solution(int num) {
        String answer="";

        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                answer+="수";
            } else if (i % 2 == 0) {
                answer += "박";
            } else {
                answer+="수";
            }
        }

        return answer;
    }
}
