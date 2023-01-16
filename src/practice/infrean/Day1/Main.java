package practice.infrean.Day1;

import java.util.Scanner;

public class Main {
    public String solution(String str){
       str.split(" ");

        return str;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(str.split(" ").toString());
//        System.out.println(main.solution(str));
    }
}
