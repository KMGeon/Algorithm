//package practice.programmers.lv1;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class solve12944 {
//
//
//    boolean solution(String s) {
//        boolean answer = true;
//        int a1 = 0, a2 = 0;
//        String n1 = s.toLowerCase();
//        char[] array = n1.toCharArray();
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 'p') {
//                a1++;
//            }
//            if (array[i] == 'y') {
//                a2++;
//            }
//        }
//        if (a1 == a2) {
//            return answer;
//        }else if(a1==0&&a2==0){
//            return answer;
//        }
//        return false;
//    }
//}
