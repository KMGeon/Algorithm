package practice.programmers.kit.stackQueue;

import java.util.ArrayList;
import java.util.Stack;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        같은숫자는싫어 main = new 같은숫자는싫어();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        for (int i : main.solution(arr)) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int prev = -1;

        for (int x : arr) {
            if (x != prev) {
                list.add(x);
                prev = x;
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
