package practice.programmers.Lv1.크기가작은부분문자열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        System.out.println(main.solution("3141592", "271")); // 2
    }

    private int solution(String t, String p) {
        int tLength = t.length();
        int pLength = p.length();
        int result = 0;

        for (int i = 0; i <= tLength - pLength; i++) {

            String subNum = t.substring(i, i + pLength);
            if (Long.parseLong(subNum) <= Long.parseLong(p)) {
                result ++;
            }
        }

        return result;
    }

}
