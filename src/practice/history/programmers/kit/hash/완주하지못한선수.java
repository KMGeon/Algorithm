package practice.history.programmers.kit.hash;

import java.util.HashMap;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        완주하지못한선수 main = new 완주하지못한선수();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(main.solution(participant, completion));
    }

    private String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }
        for (String s : map.keySet()) {
            System.out.println("s = " + s + ":" + map.get(s));
            if (map.get(s) == 1) {
                answer = s;
            }
        }
        return answer;
    }
}
