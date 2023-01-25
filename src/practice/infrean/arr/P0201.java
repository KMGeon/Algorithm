package practice.infrean.arr;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class P0201 {
    public ArrayList<Integer> solution(int n , int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        return list;
    }

    public static void main(String[] args) throws IOException {
        P0201 p0201 = new P0201();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int x : p0201.solution(n,arr)){
            System.out.println(x+" ");
        }
    }
}
/*
N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

(첫 번째 수는 무조건 출력한다)


입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.


출력

 */