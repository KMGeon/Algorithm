package practice;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        Main2 main = new Main2();

        String inputString  = "baba";


        for (String s : main.solution(inputString)) {
            System.out.println("s = " + s);
        }

    }

    private  List<String> solution(String s) {

        List<String> list = new ArrayList<>();

        recurFunction(s,"",list);

        Collections.sort(list);

        return list;
    }

    private void recurFunction(String s, String current, List<String> list) {
        if (!current.isEmpty()) {
            list.add(current);
        }

        for (int i = 0; i < s.length(); i++) {
            recurFunction(s.substring(i+1),current+s.charAt(i),list);
        }
    }


//    public static void main(String[] args) {
//        Main2 main = new Main2();
//        String inputString = "baba";
//
//        List<String> output = solution(inputString);
//        output.sort(null);
//        System.out.println("output = " + output.get(output.size()-1));
//
//    }
//
//    private static List<String> solution(String s) {
//
//        List<String> list = new ArrayList<>();
//
//        recurFunction(s, "", list);
//
//        return list;
//
//    }
//
//    private static void recurFunction(String s, String current, List<String> list) {
//        if (!current.isEmpty()) {
//            list.add(current);
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            recurFunction(s.substring(i + 1), current + s.charAt(i), list);
//        }
//    }

}
