package practice.programmers.Lv1;

public class 평균구하기 {
    public static void main(String[] args) {
        평균구하기 main = new 평균구하기();
        int[] arr = {1,2,3,4};

        System.out.println(main.solution(arr));
    }

    private double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer/arr.length;
    }
}
