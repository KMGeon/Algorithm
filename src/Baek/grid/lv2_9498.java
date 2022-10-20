package Baek.grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv2_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader writer = new BufferedReader(new InputStreamReader(System.in));
        int  score= Integer.parseInt(writer.readLine());

        if(score<=100 && score>=90){
            System.out.println('A');
        }else if(score<=89 && score>=80){
            System.out.println('B');
        } else if (score<=79&&score>=70) {
            System.out.println('C');
        } else if (score<=79 &&score>=70) {
            System.out.println('D');
        }else{
            System.out.println('F');
        }
    }
}
/*
문제
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 */