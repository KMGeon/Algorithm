package practice.infrean.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P0103 {
    public String solution(String s){
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] str = s.split(" ");
        for(String x : str){
            int len = x.length();
            if(len>m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        P0103 p0103 = new P0103();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(p0103.solution(bufferedReader.readLine()));

    }
}
