package practice.programmers.lv2;

import java.util.Arrays;
import java.util.Scanner;

public class 최대값과최소값 {
    public static void main(String[] args) {
        최대값과최소값 main = new 최대값과최소값();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }

    private String solution(String str) {
        String answer="";
        String[] s = str.split(" ");
        System.out.println("s = " + Arrays.toString(s));
        return answer;
    }
}
