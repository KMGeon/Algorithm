package practice.history.live.Temp;

import java.util.HashMap;
import java.util.Random;

public class 랜덤참거짓 {
    public static void main(String[] args) {

        랜덤참거짓 main = new 랜덤참거짓();

        System.out.println(main.solution());
    }

    private boolean solution() {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            int num = new Random().nextInt(10) + 1;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("map = " + map);

        for (Integer integer : map.keySet()) {
            if (map.get(integer) != 1) {
                return false;
            }
        }
        return true;
    }
}
