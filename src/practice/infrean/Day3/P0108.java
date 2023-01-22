package practice.infrean.Day3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P0108 {
    public String solution(String str) {
        String answer;
        str = str.toUpperCase().replaceAll("[^A-Z]", "");//알파벳이 아니면 대문자만
        String temp = new StringBuilder(str).reverse().toString();
        if (str.equals(temp)) {
            answer = "YES";
        } else {
            answer = "NO";
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        P0108 main = new P0108();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        System.out.println(main.solution(str));
    }
}
