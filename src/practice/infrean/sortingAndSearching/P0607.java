package practice.infrean.sortingAndSearching;

import java.util.Scanner;

class Point implements Comparable<Point> {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x==o.x){
            return this.y -o.y; //오름차순 이냐 내림차순이냐 결정
        }
        return 0;
    }
}


public class P0607 {

    public static void main(String[] args) {
        P0607 main = new P0607();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
}
