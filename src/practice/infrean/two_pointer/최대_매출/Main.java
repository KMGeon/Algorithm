package practice.infrean.two_pointer.최대_매출;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = IntStream.range(0, n)
                .map(i -> sc.nextInt())
                .toArray();

        System.out.println(main.solution(n, k, arr));
    }

    // n = 10, k = 3
    private int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum +=arr[i];
            answer = sum;
        }

        for (int i = k; i < n; i++) {
            sum += (arr[i]-arr[i-k]);
            System.out.println("sum = " + sum);
            answer = Math.max(answer,sum);
        }


        return answer;
    }
}
