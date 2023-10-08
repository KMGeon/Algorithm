package practice.history.live.facto;

public class factorial {
    public static void main(String[] args) {
        factorial main = new factorial();
        System.out.println(main.solution(4));
    }

    private int solution(int num) {
        if (num==1)return 1;
        else return num*solution(num-1);
    }
}
