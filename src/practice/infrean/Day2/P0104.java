package practice.infrean.Day2;

import java.util.ArrayList;
import java.util.Scanner;

public class P0104 {
    //    string builder로 이용하기
    //  전체 뒤집는 건 stringbuilder를 이용
    // 특정문자 바꾸는 건 2번 방식으로

    public ArrayList<String> solution(int n , String[] str){
        ArrayList<String> answer = new ArrayList<>();
         for(String x : str){
             String temp  = new StringBuilder(x).reverse().toString();
             answer.add(temp);
         }
        return answer;
    }
    public static void main(String[] args) {
        P0104 T = new P0104();
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String[] str = new String[n];
       for(int i=0; i<n; i++){
           str[i] = sc.next();
       }
       for(String x : T.solution(n,str)){
           System.out.println(x);
       }
    }
}
