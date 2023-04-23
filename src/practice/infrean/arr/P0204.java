package practice.infrean.arr;

import java.util.Scanner;

public class P0204 {
    public int[] solution(int a) {
        int[] answer = new int[a];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < a; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        P0204 main = new P0204();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int x : main.solution(a)) {
            System.out.print(x+" ");
        }
    }
}
