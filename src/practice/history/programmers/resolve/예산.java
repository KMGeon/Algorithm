package practice.history.programmers.resolve;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        예산 main = new 예산();
        int [] d = {1,3,2,5,4,};
        int budget = 9;
        System.out.println(main.solution(d,budget));
    }

    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;
        int currentBudget = 0;

        int left = 0;
        int right = 0;

        while (right < d.length) {
            currentBudget += d[right];

            while (currentBudget > budget) {
                currentBudget -= d[left];
                left++;
            }

            count = Math.max(count, right - left + 1);

            right++;
        }

        return count;
    }
}
