package practice.temp;

import java.util.Scanner;

public class cote {
    public static void main(String[] args) {
        cote main = new cote();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }

    private int solution(String phone_number) {

        if (phone_number.matches("\\d{3}-\\{4}-\\d{4}")) {
            return 1;
        } else if (phone_number.matches("010\\d{8}")) {
            return 2;
        } else if (phone_number.matches("\\+82-10-\\d{4}-\\d{4}}")) {
            return 3;
        } else {
            return -1;
        }
    }
}
