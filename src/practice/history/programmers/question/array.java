package practice.history.programmers.question;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class array {

    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();  // 객체 생성 (default capacity : 10)
        print(list);

        // 20개 element add
        for (int i = 1; i <= 20; i++) {
            list.add("A");
            print(list, i);
        }
    }
    // capacity 구하는 메서드
    static int getCapacity(List<String> list) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(list)).length;
    }

    // capacity와 size를 출력하는 메서드
    static void print(List<String> list) throws Exception {
        System.out.printf("size:%d, capacity:%d\n", list.size(), getCapacity(list));
    }

    static void print(List<String> list, int line) throws Exception {
        System.out.printf("Line%02d - size:%d, capacity:%d\n", line, list.size(), getCapacity(list));
    }
}
