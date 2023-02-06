package practice.infrean.hashMapTree;

import java.util.HashMap;
import java.util.Scanner;

public class P0402 {

    public static void main(String[] args) {
        P0402 main = new P0402();
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        System.out.println(main.solution(n1, n2));
    }

    private String solution(String n1, String n2) {
        String answer = "YES";
        String n11 = n1.toUpperCase();
        String n22 = n2.toUpperCase();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : n11.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : n22.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            }
            map.put(x, map.get(x)-1);
        }
        return answer;
    }
}
