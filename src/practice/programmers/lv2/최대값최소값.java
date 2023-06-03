package practice.programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 최대값최소값 {
    public static void main(String[] args) {
        최대값최소값 main = new 최대값최소값();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }

    private String solution(String str) {
        ArrayList<Integer> temp = new ArrayList<>();
        String[] s = str.split("");
        for (String c : s) {
            temp.add(Integer.parseInt(String.valueOf(c)));
        }
        Integer min = Collections.min(temp);
        Integer max = Collections.max(temp);
        String answer = min +" "+ max;
        return answer;
    }
}
