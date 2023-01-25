package practice.infrean.stringPractice.day3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P0105 {
    public String solution(String str){
        String answer = "";
        char[] s = str.toCharArray();
        int lt=0 , rt = str.length()-1;
        while (lt<rt){
            if(!Character.isAlphabetic(s[lt]) ){
                //알파벳인지 알수 있는지
                lt++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else{
                char temp = s[lt];
                s[lt]=s[rt];
                s[rt]=temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);//배열을 string 만들어준다.
        return answer;
    }
    public static void main(String[] args) throws IOException {
        P0105 main = new P0105();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        System.out.println(main.solution(str));
    }
}
