package practice.programmers.solve;

public class 음양더하기 {
    public static void main(String[] args) {
        음양더하기 main = new 음양더하기();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true, false,true};
        System.out.println(main.solution(absolutes,signs));

    }

    private int solution(int[] absolutes, boolean[] signs) {
        int answer =0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == false) {
                answer += -absolutes[i];
            }
            if ((signs[i] == true))
            {
                answer += absolutes[i];
            }
        }

        return answer;
    }
}
