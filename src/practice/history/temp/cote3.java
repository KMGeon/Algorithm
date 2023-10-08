package practice.history.temp;

import java.util.HashMap;

public class cote3 {
    public static void main(String[] args) {
        cote3 main = new cote3();
        int number = 147;
        System.out.println(main.solution(number));
    }

    private String solution(int number) {
        String[] english = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder answer = new StringBuilder();
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, english[i]);
        }

        for (char c : String.valueOf(number).toCharArray()) {
            String word = map.get(Character.getNumericValue(c));
            //성능을 생각하면 StringBuilder
            answer.append(word);
        }

        return answer.toString();
    }

}
