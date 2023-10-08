package practice.history.infrean.practice;

public class 피보나치 {
    public static void main(String[] args) {
        피보나치 main = new 피보나치();
        int n=10;
        for (int o : main.solution(n)) {
            System.out.println("o = " + o);
        }
    }

    private int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }
}
