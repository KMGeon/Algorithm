package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] v = {1,2,1,2,1};
        System.out.println(main.solution(n,v));
    }

    private int solution(int n, int[] arr) {
//        int totalSum=0;
//        int leftSum =0;
//        int minDifference = Integer.MAX_VALUE;
//        int leftCount =0;
//
//        System.out.println();
//
//        for (int num : arr) {
//            totalSum +=num;
//        }
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            leftSum+=arr[i];
//
//            int rightSum = totalSum - leftSum;
//            int difference = Math.abs(leftSum - rightSum);
//
//            if (difference < minDifference || (difference == minDifference && leftCount > i + 1)) {
//                minDifference = difference;
//                leftCount = i+1;
//            }
//        }
//        return leftCount;

        int total =0;
        for (int num : arr) {
            total +=num;
        }

        int leftSum =0;
        int rightSum = total;
        int temp = Integer.MAX_VALUE;
        int leftCount =0;

        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            rightSum -=arr[i];
            int difference = Math.abs(leftSum - rightSum);

            if (difference < temp || (difference == temp && leftCount > i + 1)) {
                temp = difference;
                leftCount = i+1;
            }
        }

        return leftCount;
    }
}
/**
 * class Solution {
 *     public int solution(int n, int[] arr) {
 *         int total =0;
 *         int answer =0;
 *         int leftSum =0;
 *
 *         for (int num : arr) {
 *             total +=num;
 *         }
 *
 *         int rightSum = total;
 *         int temp = Integer.MAX_VALUE;
 *
 *         for (int i = 0; i < arr.length - 1; i++) {
 *             leftSum += arr[i];
 *             rightSum -=arr[i];
 *             int minus = Math.abs(leftSum - rightSum);
 *
 *             if (minus < temp || (minus == temp && answer > i + 1)) {
 *                 temp = minus;
 *                 answer = i+1;
 *             }
 *         }
 *
 *         return answer;
 *     }
 * }
 */