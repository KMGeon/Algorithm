package practice.infrean.BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//BFS ->최단거리  -> 상태트리검색
public class P0708 {
    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch; //한번 큐에 들어간 배열 -> 시간 복잡도를 줄이기 위해
    Queue<Integer> queue = new LinkedList<>();

    public int BFS(int n1, int n2) {
        ch = new int[10001];
        ch[n1] = 1;
        queue.offer(n1);
        int level = 0;

        while (!queue.isEmpty()){
            int len = queue.size();//레벨에 있는 노드의 수
            for(int i = 0; i < len; i++){
                int x = queue.poll();

//                if(x==n2){
//                    return level;
//                }

                for (int j=0; j<3;j++){ //dis- >3개
                    int nx = x+dis[j]; //root에 자식 노드

                    if(nx==n2){
                        return level+1;
                    }

                    if(nx>=1 && nx<=10000 && ch[nx]==0){ //ch[nx]==0 방문 x
                        ch[nx]=1;
                        queue.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        P0708 main = new P0708();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(main.BFS(n1, n2));
    }
}
