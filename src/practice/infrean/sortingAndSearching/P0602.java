package practice.infrean.sortingAndSearching;

import java.util.Scanner;

public class P0602 {
    public static void main(String[] args) {
        P0602 main = new P0602();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : main.solution(n1, arr)) {
            System.out.print(i + " ");
        }
    }

    private int[] solution(int n1, int[] arr) {
       for (int i=0;i<n1-1;i++){
           for (int j=0;i<n1-i-1;j++){
               if(arr[j]>arr[j+1]){
                   int tmp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = tmp;
               }
           }
       }
       return arr;
    }
}
