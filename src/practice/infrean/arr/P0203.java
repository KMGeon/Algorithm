package practice.infrean.arr;

import java.util.Scanner;

/*
1 ->3 승리
2->1 승리
3-> 2 승리
 */
public class P0203 {
    public String solution(int input, int[] push , int[]push2) {
        String answer="";
        for(int i=0; i<input; i++) {
            if(push[i]==push2[i]){
                answer+="D";
            }else if(push[i]==1&&push2[i]==3){
                answer +="A";
            }else if(push[i]==2&&push2[i]==1){
                answer +="A";
            }else if(push[i]==3&&push2[i]==2){
                answer +="A";
            }else {
                answer+="B";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P0203 main = new P0203();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] push = new int[input];
        int[] push2 = new int[input];
        for (int i = 0; i < input; i++) {
                push[i] = sc.nextInt();
        }
        for (int i = 0; i < input; i++) {
            push2[i] = sc.nextInt();
        }
        for(char c : main.solution(input,push,push2).toCharArray()){
            System.out.println(c);
        }
    }
}
