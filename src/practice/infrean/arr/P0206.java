package practice.infrean.arr;

import java.util.ArrayList;
import java.util.Scanner;

public class P0206 {
    public int isPrime(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public String solution(int[] arr) {
        String realAnswer="";
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String str = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
            Integer.parseInt(str);
            if(isPrime(Integer.parseInt(str))==1 && Integer.parseInt(str)!=1){
                    answer.add(Integer.parseInt(str));
            }
        }
        for(int i=0; i<answer.size(); i++){
            realAnswer+=answer.get(i).toString()+" ";
        }
        return realAnswer;
    }

    public static void main(String[] args) {
        P0206 main = new P0206();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];
        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(arr));
    }
}
