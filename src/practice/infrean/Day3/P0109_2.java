package practice.infrean.Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P0109_2 {
    public int solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){// isDigit은 숫자인지 판단
                answer+=x;
            }
        }
        return Integer.parseInt(answer);
    }


    public static void main(String[] args) throws IOException {
        P0109_2 main = new P0109_2();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        System.out.println(main.solution(str));
    }
}
