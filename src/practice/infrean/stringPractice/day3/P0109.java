package practice.infrean.stringPractice.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P0109 {
    public int solution(String str) {
        String answer = "";
        String s = str.replaceAll("[^0-9]", "");
        char[] temp = s.toCharArray();
        for(int i=0;i<temp.length;i++){
            String test = new String(String.valueOf(temp[i]));
            answer+=test;
        }
        return Integer.parseInt(answer);
    }


    public static void main(String[] args) throws IOException {
        P0109 main = new P0109();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        System.out.println(main.solution(str));
    }
}
/*
문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.

만약 “tge0nh205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.

추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 */
