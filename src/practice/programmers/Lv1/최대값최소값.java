package practice.programmers.Lv1;

public class 최대값최소값 {
    public static void main(String[] args) {
        최대값최소값 main = new 최대값최소값();
        String s = "1 2 3 4";
        System.out.println("main.solution(s) = " + main.solution(s));
    }

    private String solution(String s) {
        String answer = "";

        String[] sArr = s.split(" ");
        int[] intArr = new int[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            intArr[i] = Integer.parseInt(sArr[i]);
        }

        int min = intArr[0]; // 최소값 초기화
        int max = intArr[0]; // 최대값 초기화

        for (int i = 1; i < intArr.length; i++) { // i=0 대신 i=1부터 시작
            if (intArr[i] < min) min = intArr[i];
            if (intArr[i] > max) max = intArr[i];
        }

        answer = min + " " + max; // 최소값과 최대값을 문자열로 결합

        return answer;
    }

}
