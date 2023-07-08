package practice.temp;

public class cote5 {
    public static void main(String[] args) {
        cote5 main = new cote5();
        int n = 9;
        System.out.println(main.solution(n));
    }

    private int solution(int n) {

        int count = Integer.bitCount(n);
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (Integer.bitCount(i) == count) {
                answer++;
            }
        }


        return answer;
    }
}
