package practice.infrean.arr;

import java.util.Scanner;

public class P0207 {
    public int solution(int input,int[] arr) {
        int answer = 0;
        int count =0;

        for(int i=0;i<input;i++) {
            if(arr[i]==1){
            count++;
            answer+=count;
            }else count=0;
        }

        return answer;
    }

    public static void main(String[] args) {
        P0207 main = new P0207();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];
        for(int i = 0; i < input; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(main.solution(input,arr));
    }
}
