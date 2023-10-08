package practice.infrean.two_pointer.두_배열_합치기;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int[] arr1 = IntStream.range(0, input1)
                .map(i -> sc.nextInt())
                .toArray();

        int input2 = sc.nextInt();
        int[] arr2 = IntStream.range(0, input2)
                .map(i -> sc.nextInt())
                .toArray();

        for (int i : main.solution(input1, input2, arr1, arr2)) {
            System.out.print(i+" ");
        }

    }

    private ArrayList<Integer> solution(int input1, int input2, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < input1 && p2 < input2) {
            if (arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }
        while (p1 < input1) answer.add(arr1[p1++]);

        while (p2 < input2) answer.add(arr2[p2++]);

        return answer;
    }

}
