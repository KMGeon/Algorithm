package practice.programmers.Lv1;

public class 숫자의표현 {
    public static void main(String[] args) {
        숫자의표현 main = new 숫자의표현();
        int input = 15;
        System.out.println(main.solution(input));
    }

    private int solution(int n) {
        int answer = 0;
        int left = 1;  // 왼쪽 포인터
        int right = 1; // 오른쪽 포인터
        int sum = 0;   // 현재 범위의 합

        while (left <= n) {
            if (sum < n) {
                sum += right;
                right++;
            } else if (sum > n) {
                sum -= left;
                left++;
            } else {  // sum == n
                answer++;
                sum -= left;
                left++;
            }
        }

        return answer;
    }
}
