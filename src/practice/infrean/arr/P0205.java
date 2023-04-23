package practice.infrean.arr;

import java.util.Scanner;

//에라토스테네스 체
//못풀었음
public class P0205 {
    public int solution(int inputNum) {
        int answer = 0;
        int[] arr = new int[inputNum+1];
        for(int i=2; i<=inputNum ; i++){
            if(arr[i]==0){
                answer++;
                for(int j=i;j<=inputNum;j=j+i){
                    arr[j]=1;
                }
            }
        }
       return answer;
    }

    public static void main(String[] args) {
        P0205 main = new P0205();
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        System.out.println(main.solution(inputNum));
    }
}
