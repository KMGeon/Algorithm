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

    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++) {
            int cnt = 0;

            for(int j = 1; j <= i; j++) {
                if(i % j == 0) cnt++;
            }

            if(cnt % 2 == 0) answer += i;

            else answer -= i;
        }

        return answer;
    }
}
