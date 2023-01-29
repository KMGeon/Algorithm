package practice.programmers.lv1;

import java.util.Scanner;

public class mugeon_1 {
        public int solution(int num1, int num2) {
            int answer = 0;

            if (0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100) {
                answer = num1 * num2;
            }

            return answer;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        mugeon_1 mugeon1 = new mugeon_1();
        System.out.println(mugeon1.solution(num1 , num2));

    }
}
