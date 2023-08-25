package practice.programmers.resolve;

public class 다은큰숫자 {
    public static void main(String[] args) {
        다은큰숫자 main = new 다은큰숫자();
        int n = 15;
        System.out.println(main.solution(n));
    }

    private int solution(int n) {
        int originalCount = getBinaryFindOne(n);

        int nextNumber = n + 1;

        while (true) {
            int nextCount = getBinaryFindOne(nextNumber);

            if (nextCount == originalCount) {
                return nextNumber;
            }
            nextNumber++;
        }
    }

    private int getBinaryFindOne(int n) {
        int answer = 0;
        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '1') {
                answer++;
            }
        }
        return answer;
    }
}
