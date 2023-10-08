package practice.history.groome;

import java.util.Scanner;

public class 숫자제거배열 {
    public static void main(String[] args) {
        숫자제거배열 main = new 숫자제거배열();
        Scanner sc = new Scanner(System.in);

        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        int[] arr = new int [n1];

        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }



        System.out.println(main.solution(n1,n2, arr));
    }

    private int solution(int n1, int n2, int[] arr) {
        int answer =0;

        String s = String.valueOf(arr);
        for (char c : s.toCharArray()) {
            if (c == n2) {
                answer++;
            }
        }


        return answer;
    }
}
