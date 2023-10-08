package practice.history.programmers.kit.hash;

import java.util.HashSet;

public class 전화번호목록 {
    public static void main(String[] args) {
        전화번호목록 main = new 전화번호목록();
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(main.solution(phone_book));
    }

    private boolean solution(String[] phoneBook) {
//        HashMap<String, Integer> map = new HashMap<>();
//
//        for (String x : phoneBook) {
//            map.put(x, map.getOrDefault(x, 0) + 1);
//        }
//        for (int i = 0; i < phoneBook.length; i++) {
//            for (int j = 0; j < phoneBook[i].length(); j++) {
//                if (map.containsKey(phoneBook[i].substring(0, j))) ;
//                return false;
//            }
//        }
        HashSet<String> set = new HashSet<>();
        for (String str : phoneBook) {
            set.add(str);
        }

        for (String s : phoneBook) {
            for (int i = 1; i < phoneBook.length; i++) {
                if (set.contains(s.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
