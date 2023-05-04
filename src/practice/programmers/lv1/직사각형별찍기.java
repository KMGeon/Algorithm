package practice.programmers.lv1;

import java.util.Scanner;

public class 직사각형별찍기 {
    public static void main(String[] args) {
        직사각형별찍기 main = new 직사각형별찍기();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i = 0; i < num2; i++) {
            for (int j = 0; j < num1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
