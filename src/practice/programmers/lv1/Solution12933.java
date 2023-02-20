package practice.programmers.lv1;

import java.util.ArrayList;
import java.util.Scanner;

//정수 내림차순으로 배치하기
public class Solution12933 {

    public long solution(long n) {
        long answer = 0;
        System.out.println("n = " + n);
        char[] chars = String.valueOf(n).toCharArray();
        for (int i=0;i<chars.length;i++){
            System.out.println("i = " + chars[i]);
            if (chars[i]<chars[i+1]){
                int tmp = chars[i];
                chars[i+1] = chars[i];
                chars[i+1] = (char) tmp;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution12933 main = new Solution12933();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        main.solution(n);
    }
}
