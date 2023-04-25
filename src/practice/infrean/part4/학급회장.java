package practice.infrean.part4;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장 {
    public static void main(String[] args) {
        학급회장 main = new 학급회장();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println("main.solution(n,str) = " + main.solution(n, str));
    }

    private char solution(int n, String str) {
        char answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1); //get
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {//존재하는 키를 탐색한다.
            System.out.println(key+":"+map.get(key));
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }
}
