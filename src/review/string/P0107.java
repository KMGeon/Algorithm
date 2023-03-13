package review.string;

import java.util.Scanner;

//회문 문자열
public class P0107 {
    public String solution(String str) {
        String answer = "";
        char[] upper = str.toUpperCase().toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            char tmp = upper[lt];
            upper[lt] = upper[rt];
            upper[rt] = tmp;
            lt++;
            rt--;
        }
        answer = String.valueOf(upper);
        if (answer.equals(str.toUpperCase())) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        P0107 main = new P0107();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(main.solution(str));
    }
}
