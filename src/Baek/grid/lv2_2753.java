package Baek.grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv2_2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader out = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(out.readLine());

        if(year%4==0&&(year%100!=0||year%400==0)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
