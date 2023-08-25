package practice.programmers.resolve;

import java.util.Arrays;

public class 삼총사 {
    public static void main(String[] args) {
        삼총사 main = new 삼총사();
        int [] number ={-2,3,0,3,-5};
        System.out.println("main.solution(number) = " + main.solution(number));
    }

    public int solution(int[] number) {
        Arrays.sort(number);
        int count = 0;
        int length = number.length;

        for (int i = 0; i < length - 2; i++) {

            if (i > 0 && number[i] == number[i - 1]) {
                continue; // 중복된 값일 경우 넘어감
            }

            int left = i + 1;
            int right = length - 1;

            while (left < right) {
                int sum = number[i] + number[left] + number[right];

                if (sum == 0) {
                    count++;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}