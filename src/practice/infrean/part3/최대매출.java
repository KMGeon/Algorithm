package practice.infrean.part3;

import java.util.Scanner;

public class 최대매출 {
    public static void main(String[] args) {
        최대매출 main = new 최대매출();
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int[] arr = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(num1,num2,arr));
    }

    private int solution(int num1, int num2, int[] arr) {
        int answer=0;

        int p1=0,p2=0;

        return answer;
    }
}
