package practice.study;

import java.util.Arrays;
import java.util.Scanner;

public class P12944 {
    public static void main(String[] args) {
        P12944 main = new P12944();
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int[] arr = new int[i];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        System.out.println(main.solution(arr));
    }

    private double solution(int[] arr) {
//        double answer = 0, sum = 0;
//        for (int i=0;i<arr.length;i++){
//            sum +=arr[i];
//        }
//        answer = sum/arr.length;
//        return answer;
        return Arrays.stream(arr).average().orElse(0);
    }
}
