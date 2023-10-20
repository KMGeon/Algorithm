package practice.programmers.Lv1;

import java.util.Scanner;

public class 핸드폰번호가리기 {
    public static void main(String[] args) {
        핸드폰번호가리기 main = new 핸드폰번호가리기();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));
    }

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        char[] arr = str.toCharArray();

        for (int i = 0; i<str.length()-4; i++) {
            arr[i] = '*';
        }
        for (int i = 0; i<str.length(); i++) {
            answer.append(arr[i]);
        }

        return answer.toString();
    }
}
