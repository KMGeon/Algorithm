package practice.infrean.part2;

import java.util.ArrayList;
import java.util.Scanner;

public class 큰수출력하기 {
    public static void main(String[] args) {
        큰수출력하기 main = new 큰수출력하기();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        for (Integer integer : main.solution(num,arr)) {
            System.out.println(integer);
        }
    }

    private ArrayList<Integer> solution(int num, int[] arr) {
        ArrayList<Integer> anser = new ArrayList<>();


        return anser;
    }
}
