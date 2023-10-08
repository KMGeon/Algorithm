package practice.infrean.two_pointer.두_배열_합치기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int [] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int [] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        for (Integer integer : main.solution(arr1, arr2)) {
            System.out.print(integer+" ");
        }
    }

    private ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();


        for (int i : arr1) {
            answer.add(i);
        }
        for (int i : arr2) {
            answer.add(i);
        }

        Collections.sort(answer);


        return answer;
    }
}
