package practice.programmers.Lv1;

import java.util.Scanner;

public class 정수내림차순 {
    public static void main(String[] args) {
        정수내림차순 main = new 정수내림차순();
        Scanner sc = new Scanner(System.in);
        Long input = sc.nextLong();

        System.out.println(main.solution(input));

    }

    private Long solution(Long input) {
        String answer = "";
        String str = Long.toString(input);
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return Long.parseLong(answer);
    }
}
