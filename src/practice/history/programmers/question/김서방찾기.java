package practice.history.programmers.question;

public class 김서방찾기 {
    public static void main(String[] args) {
        김서방찾기 main = new 김서방찾기();
        String[] seoul = {"jane", "kim"};
        System.out.println(main.solution(seoul));
    }

    public String solution(String[] seoul) {
        int answerint = 0;
        String answer = "김서방은" + answerint + "에 있다.";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("kim")) {
                return "김서방은" + i + "에 있다.";
            }
            System.out.println("seoul[i] = " + seoul[i]);
        }
        return answer;
    }
}
