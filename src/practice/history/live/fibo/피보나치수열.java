package practice.history.live.fibo;

/**
 * 배열을 이용한 피보나치 수열
 * 이때 a[n-2] + a[n-1]을 통하여 a[n]을 구한다.
 */
public class 피보나치수열 {
    public static void main(String[] args) {

        피보나치수열 main = new 피보나치수열();

        int num = 7;
        for (int i : main.solution(num)) {
            System.out.println(i);
        }
    }

    private int[] solution(int num) {
        int[] answer = new int[num];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < num; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }
}
