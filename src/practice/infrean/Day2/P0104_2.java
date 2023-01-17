package practice.infrean.Day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//특정 부분만 바꾸면 tochararray로 사용하기
public class P0104_2 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
            String temp = String.valueOf(s);
            answer.add(temp);
        }
        return answer;
    }

    public static void main(String[] args) {
        P0104 T = new P0104();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}
