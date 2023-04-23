//package practice.programmers.lv1;
//
//public class s12916 {
//    class Solution {
//        boolean solution(String s) {
//            boolean answer = true;
//            int a1 = 0, a2 = 0;
//            String n1 = s.toLowerCase();
//            char[] array = n1.toCharArray();
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] == 'p') {
//                    a1++;
//                }
//                if (array[i] == 'y') {
//                    a2++;
//                }
//            }
//            if (a1 == a2) {
//                return answer;
//            } else if (a1 == 0 && a2 == 0) {
//                return answer;
//            }
//            return false;
//        }
//    }
//}
