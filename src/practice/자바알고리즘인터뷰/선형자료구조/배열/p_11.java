package practice.자바알고리즘인터뷰.선형자료구조.배열;

import java.util.ArrayList;

public class p_11 {
    public static void main(String[] args) {
        int[] input = {1, 3, 5, 7};

        for (Integer i : p_11.solution(input)){
            System.out.println("i = " + i);
        }

    }

    private static int[] solution(int[] input) {
        int inputLength = input.length;
        int[] resultArr = new int[inputLength];
        int p=1;

        for (int i = 0; i < inputLength; i++) {
            resultArr[i] = p;
            p *= input[i];
        }

        p=1;
        for (int i = input.length - 1; i >= 0; i--) {
            resultArr[i] *= p;
            p*=input[i];
        }


        return resultArr;
    }
}
