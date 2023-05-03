package practice.programmers.lv1;

import java.util.Scanner;

public class 콜라츠 {
    public static void main(String[] args) {
        콜라츠 main = new 콜라츠();
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();

        System.out.println(main.solution(input));
    }

    public int solution(long num) {
        int answer = 0;

        while(num != 1) {
            if(num % 2 == 0)
                num /= 2;
            else
                num = num * 3 + 1;
            answer++;

            if(answer >= 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}
