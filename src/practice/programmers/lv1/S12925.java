package practice.programmers.lv1;

import java.util.Scanner;

public class S12925 {
    public int solution(String s) {
        int answer = 0;
        int i = Integer.parseInt(s);
        System.out.println("i = " + i);
        return answer;
    }

    public static void main(String[] args) {
        S12925 main = new S12925();
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        System.out.println(main.solution(s));
    }
}
