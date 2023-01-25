package practice.infrean.stringPractice.day1;

import java.util.Scanner;

//1. 문자 찾기
public class P0101 {
    //    public static void main(String[] args) {
//        int count = 0;
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        char c = sc.next().charAt(0);
//        for(int i=0;i<str.length();i++) {
//          if(str.charAt(i) ==Character.toLowerCase(c) || str.charAt(i)==Character.toUpperCase(c)){
//              count++;
//            }
//        }
//        System.out.println(count);
//    }
    public int solution(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toLowerCase(c) || str.charAt(i) == Character.toUpperCase(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        P0101 main = new P0101();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(main.solution(str, c));

    }
}
