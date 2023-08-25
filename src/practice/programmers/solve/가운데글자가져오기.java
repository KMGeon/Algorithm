package practice.programmers.solve;

import java.util.Scanner;

public class 가운데글자가져오기 {
    public static void main(String[] args) {
        가운데글자가져오기 main = new 가운데글자가져오기();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(main.solution(str));
    }

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        if (str.length() % 2 != 0) {
            for (int i = 0; i < str.length(); i++) {
                int tmp = str.length() / 2;
                if (i >= tmp) {
                    char[] array = str.toCharArray();
                    answer.append(array[i]);
                    break;
                }

            }
        }

        if (str.length() % 2 == 0) {
            int tmp = str.length() / 2 -1;
            for (int i = 0; i < str.length(); i++) {
                if (i == tmp || i == tmp + 1) {
                    char[] arr = str.toCharArray();
                    answer.append(arr[i]);
                }
            }
        }

        return answer.toString();
    }
}
