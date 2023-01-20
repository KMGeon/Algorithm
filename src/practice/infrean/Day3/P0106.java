package practice.infrean.Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P0106 {
    public String solution(String str){
        String answer ="";
        for(int i=0; i<str.length(); i++){
//            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)) );
            if(str.indexOf(str.charAt(i))==i){
                answer += str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        P0106 main = new P0106();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        System.out.println(main.solution(str));
    }
}
