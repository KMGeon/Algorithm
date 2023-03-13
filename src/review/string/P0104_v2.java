package review.string;

import java.util.ArrayList;
import java.util.Scanner;

public class P0104_v2 {

    public ArrayList<String> solution(int num,String[] strArr){
        ArrayList<String> answer = new ArrayList<>();
        int lt =0;

        for (String s : strArr) {
            char[] c = s.toCharArray();
            int rt = s.length()-1;

            while (lt<rt){
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(c);
            answer.add(tmp);
        }

        return answer;
    }
    public static void main(String[] args) {
        P0104_v2 main = new P0104_v2();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] strArr = new String[num];
        for (int i=0;i<num;i++){
            strArr[i] = sc.next();
        }
        for (String x : main.solution(num,strArr)) {
            System.out.println("x = " + x);
        }

    }
}
