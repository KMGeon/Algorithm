package review.string;

import java.util.Scanner;

public class P0104 {
    public String solution(int n1 , String[] str){
        String answer="";
        for (String s : str) {
            StringBuilder result = new StringBuilder(s).reverse();
            answer+=result;
        }

        return answer;
    }
    public static void main(String[] args) {
        P0104 main = new P0104();
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        String[] str = new String[n1];
        for (int i=0;i<n1;i++){
            str[i] = sc.next();
        }
        System.out.println(main.solution(n1 , str));
    }
}
