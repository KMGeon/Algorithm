package practice.infrean.hashMapTree;

import java.util.HashMap;
import java.util.Scanner;

public class P0401 {
    public static void main(String[] args) {
        P0401 main = new P0401();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        String str = sc.next();
        System.out.println(main.solution(n1, str));
    }

    private String solution(int n1, String str) {
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (char x : map.keySet()) {
            System.out.println(x);
        }
        return answer;
    }
}
