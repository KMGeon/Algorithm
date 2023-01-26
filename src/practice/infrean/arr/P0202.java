package practice.infrean.arr;

import java.util.ArrayList;
import java.util.Scanner;

public class P0202 {
    public int solution(int a, int[] b){
        int answer = 1;
        int max = b[0];
        for(int i = 0; i <a; i++){
            if(b[i]>max){
                answer++;
                max = b[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        P0202 p0202 = new P0202();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b[] = new int[a];
        for (int i=0;i<a;i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(p0202.solution(a,b));

    }
}
