package practice.programmers.Lv1;

public class 이진변환반복하기 {
    public static void main(String[] args) {
        이진변환반복하기 main = new 이진변환반복하기();
        String input = "110010101001";
//        main.solution(input);
        for (int i : main.solution(input)) {
            System.out.println("i = " + i);
        }
    }

    /**
     * 1. 0을 제거한다. ->replace (답지)
     * 2. 이진수 표현
     */
    private int[] solution(String s) {
        int[] answer = new int[2];
        int convertCount = 0;
        int removedZeroCount = 0;

        while (!s.equals("1")) {
            int originalLength = s.length();
            s = s.replace("0", "");
            int newLength = s.length();
            int removedZeros = originalLength - newLength;
            removedZeroCount += removedZeros;
            s = Integer.toBinaryString(newLength);
            convertCount++;
        }

        answer[0] = convertCount;
        answer[1] = removedZeroCount;
        return answer;
    }

}
