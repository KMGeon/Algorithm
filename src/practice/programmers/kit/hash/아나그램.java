package practice.programmers.kit.hash;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {
    public static void main(String[] args) {
        아나그램 main = new 아나그램();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(main.solution(str1, str2));

    }

    //    private String solution(String str1, String str2) {
//        char[] arr1 = str1.toUpperCase().toCharArray();
//        char[] arr2 = str2.toUpperCase().toCharArray();
//        HashMap<Character, Integer> map = new HashMap<>();
//        HashMap<Character, Integer> map2 = new HashMap<>();
//
//        for (char c : arr1) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        for (char c : arr2) {
//            map2.put(c, map2.getOrDefault(c, 0) + 1);
//        }
//        if (map.equals(map2)) {
//            return "YES";
//        }
//        return "NO";
//    }
    private String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : str2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            }
                map.put(x,map.get(x)-1);
        }

        return answer;
    }
}
