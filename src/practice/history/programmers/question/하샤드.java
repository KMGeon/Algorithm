package practice.history.programmers.question;

import java.util.Scanner;

public class 하샤드 {
    public static void main(String[] args) {
        하샤드 main = new 하샤드();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(main.solution(input));
    }

    public boolean solution(int input) {
        String str = Integer.toString(input);

        int sum =0;
        for (char x : str.toCharArray()) {
            int i = Integer.parseInt(String.valueOf(x));
            sum +=i;
        }

        if (input % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}
