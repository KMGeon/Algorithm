package practice.infrean.Day3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
앞에서 읽나 뒤에서 읽으나 똑같은 문자를 회문 문자
회문이면 YES 아니면 NO
 */
public class P0107 {
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        P0107 main = new P0107();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        System.out.println(main.solution(str));
    }
}
