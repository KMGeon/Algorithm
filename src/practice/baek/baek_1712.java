package practice.baek;

import java.util.Scanner;

public class baek_1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixed = sc.nextInt(); // 고정 비용
        int vari = sc.nextInt(); // 가변 비용
        int cost = sc.nextInt(); // 제품 가격
        int q; // BEF 매출액, 순익분기점 달성에 필요한 매출
        if (vari >= cost) { // 제품 1개 만드는 재료비(가변)가 제품 가격보다 비싸거나 같으면 무조건 손해.(모든 비용이 자연수(1,2,..)이기 때문에)
            System.out.println(-1);
        } else { // 제품 가격이 제품 재료비보다 높다면 어쨌든 팔면 이득이 생김.
            q =  fixed / (cost - vari); //손익분기점의 매출 개수 구하는 공식
            System.out.println(q + 1); //손익분기점에서 이득이 시작되는 부분을 찾아야 하므로+1
        }
    }
}