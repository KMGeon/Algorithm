package practice.history.groome;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// 짝수만을 필터링하여 새로운 스트림을 생성
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList())
                .stream().forEach(System.out::println);

    }
}
