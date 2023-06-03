package practice.programmers.lv1;

public class 없는숫자더하기 {
    public static void main(String[] args) {
        없는숫자더하기 main = new 없는숫자더하기();
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(main.solution(numbers));
    }

    private int solution(int[] numbers) {
        int answer = 0;
        boolean[] flag = new boolean[10];

        for (int number : numbers) {
            flag[number] = true;
        }

        for (int i = 0; i < flag.length; i++) {
            if (!flag[i]) {
                answer += i;
            }
        }

        return answer;
    }
}
