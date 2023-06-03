package practice.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 정수 내림차순으로 배치하기
 */
public class p12933 {
    public static void main(String[] args) {
        p12933 main = new p12933();
        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        System.out.println(main.solution(num1));
        ArrayList<Character> objects = new ArrayList<>();
        objects.add('a');
        objects.add('c');
        objects.add('b');
        objects.add('d');
        Collections.sort(objects);
        for (Character object : objects) {
            System.out.println("object = " + object);
        }
    }

//    private int solution(int num1) {
//        int answer = 0;
//        String[] list = String.valueOf(num1).split("");
//        Arrays.sort(list);
//        for (String s : list) {
//
//        }
//        return answer;
//    }
}
