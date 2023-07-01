package practice.programmers.lv1;

import java.util.ArrayList;
import java.util.Scanner;

public class 약수의개수와덧셈 {
    public static void main(String[] args) {
        약수의개수와덧셈 main = new 약수의개수와덧셈();
        Scanner sc = new Scanner(System.in);
        int leftNum = sc.nextInt();
        int rightNum = sc.nextInt();
        System.out.println(main.solution(leftNum, rightNum));
    }

    private int solution(int leftNum, int rightNum) {
        int loopNum = rightNum - leftNum + 1;
        int [] arr = new int[loopNum];
        for (int i = leftNum; i < loopNum; i++) {
            arr[i - leftNum] = i;
        }
        return loopNum;
    }
}
