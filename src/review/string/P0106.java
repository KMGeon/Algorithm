package review.string;

import java.util.Scanner;

public class P0106 {
    public String solution(String str){
        String answer="";

        for (int i=0;i<str.length();i++){
//            System.out.println(str.charAt(i)+":"+i+": "+str.indexOf(str.charAt(i)));
            if (i == str.indexOf(str.charAt(i)))answer+=str.charAt(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        P0106 main = new P0106();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
/*
i       |     str.indexOf(str.charAt(i))
1                   1
2                   2
3                   1

-> 만약에 처음 나오는 값이 있으면 i와 indexOf의 값이 같지만
-> 중복되는 값이 있다고 생각하면 값이 서로 다르다.
 */