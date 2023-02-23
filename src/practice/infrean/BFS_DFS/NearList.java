package practice.infrean.BFS_DFS;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class NearList {
    static int n,m ,answer = 0;
    static ArrayList<ArrayList<Integer>>graph;
    static int[]ch;

    public void DFS(int v){

    }


    public static void main(String[] args) {
        NearList main = new NearList();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<=n;i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for (int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1]=1;
        main.DFS(1);
        System.out.println(answer);
    }
}
