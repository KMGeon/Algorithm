package practice.history.programmers.question;

import java.util.Scanner;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        이상한문자만들기 main = new 이상한문자만들기();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        boolean isEven = true;
        for (char c : str.toCharArray()) {
            if (c == ' ') { // 공백 문자일 경우 그대로 추가
                answer.append(c);
                isEven = true; // 단어의 길이를 새로 시작할 수 있도록 초기화
            } else if (isEven) { // 짝수 인덱스일 경우
                answer.append(Character.toUpperCase(c));
                isEven = false;
            } else { // 홀수 인덱스일 경우
                answer.append(Character.toLowerCase(c));
                isEven = true;
            }
        }
        return answer.toString();
    }
}
