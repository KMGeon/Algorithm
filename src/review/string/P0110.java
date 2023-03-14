package review.string;

import java.util.Scanner;

public class P0110 {
    public String solution(String str1 , char target){
        String answer="";

        char[] charArray = str1.toCharArray();

        for (int i=0;i<charArray.length;i++){
            int lt =0, rt=charArray.length-1;
        }

        return answer;
    }
    public static void main(String[] args) {
        P0110 main = new P0110();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char target = sc.next().charAt(0);

        System.out.println(main.solution(str1 , target));
    }
}
