package practice.infrean.part1;

import java.util.Scanner;

public class 문장속단어 {
    public static void main(String[] args) {
        문장속단어 main = new 문장속단어();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (String s : str.split(" ")) {
            System.out.println("s = " + s);
        }
    }

    private String solution(String str) {
        String answer = "";
        return answer;
    }
}
