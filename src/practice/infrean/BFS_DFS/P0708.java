package practice.infrean.BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//BFS 최단거리
public class P0708 {
    int answer = 0;
    int[] dis = {1, -1, 5};
    int ch[];

    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while (!Q.isEmpty()) {
            //level 탐색
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();//꺼냄
                if (x==3){
                    return L;
                }
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
                L++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        P0708 main = new P0708();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); //출발 ->5
        int e = sc.nextInt(); // 도착 ->15
        System.out.println(main.BFS(s, e));
    }
}
