package practice.programmers.solve;

public class 부족한금액계산하기 {
    public static void main(String[] args) {
        부족한금액계산하기 main = new 부족한금액계산하기();
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(main.solution(price, money, count));
    }

    public long solution(int price, int money, int count) {
        long answer = 0;
        long total=0;

        //탄 횟수만큼 금액 늘리며 더하기
        for(int i=1; i<count+1; i++){
            total += price*i;
        }
        //가진 돈보다 비용이 많이 들 경우
        if(money<total)
            answer = total-money;
            //모자라지 않는 경우
        else
            answer = 0;

        return answer;
    }
}
