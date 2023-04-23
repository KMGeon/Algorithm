package practice.infrean.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {
    public static void main(String[] args) {
        단어뒤집기 main = new 단어뒤집기();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] strArray = new String[num];
        for (int i = 0; i < num; i++) {
            strArray[i] = sc.next();
        }
        for (String x : main.solution(num, strArray)) {
            System.out.println(x);
        }
    }

    private ArrayList<String> solution(int num, String[] strArray) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String tmp = new StringBuilder(strArray[i]).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
}
