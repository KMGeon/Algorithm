package review.string;

import java.util.Scanner;

public class P0101 {
    public static void main(String[] args) {
        P0101 main = new P0101();
        Scanner sc = new Scanner(System.in);

        String n1 = sc.next();
        char n2 = sc.next().charAt(0);

        System.out.println("solution(n1,n2) = " + main.solution(n1, n2));
    }

    private int solution(String n1, char n2) {
        int answer = 0;

        n1 = n1.toUpperCase();
        n2 = Character.toUpperCase(n2);

        for (int i=0;i<n1.length();i++){
            if (n1.charAt(i)==n2){
                answer++;
            }
        }
        return answer;
    }
}
