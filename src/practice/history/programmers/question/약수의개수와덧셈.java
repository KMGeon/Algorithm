package practice.history.programmers.question;

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

            for (int num = left; num <= right; num++) {
                int divisorCount = countDivisors(num);

                if (divisorCount % 2 == 0) {
                    answer += num;
                } else {
                    answer -= num;
                }
            }
            return answer;
        }

        private int countDivisors(int num) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            return count;
        }
}