package practice.history.programmers.solve;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JadenCase {
    public static void main(String[] args) {
        JadenCase main = new JadenCase();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }

    private String solution(String s) {
        s = s.toLowerCase(); //처음부터 다 소문자로 바꿔버리기

        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            // 만약 단어가 공백이면 그대로 출력해주고
            if (word.equals(" "))
                sb.append(word);
            else { //아니라면 첫글자 대문자 변환해주기
                sb.append(word.substring(0, 1).toUpperCase() + word.substring(1));
            }
        }
        return sb.toString();
    }
}
