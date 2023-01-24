package practice.infrean.Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int[] solution(String str , char c) {
       int[]answer = new int[str.length()];
        int p=1000;
        for(int i=0;i< str.length();i++){
            if(str.charAt(i)==c){
                p=0;
                answer[i]=p;
            }else{
                p++;
                answer[i]=p;
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        char c = bf.readLine().charAt(0);
        for(int x:main.solution(str,c)){
            System.out.println(x+"");
        }
    }
}
