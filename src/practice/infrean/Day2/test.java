package practice.infrean.Day2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] test = new String[1];
        for (int i = 0; i < test.length; i++) {
            test[i] = sc.next();
        }
        for (String x : test) {
            char[] chars = x.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                System.out.println(chars[i]);
            }
        }

    }
}
