package practice.infrean.BFS_DFS;

import java.util.Scanner;

public class P0801 {
    static int n,total = 0;
    static String answer = "No";
    boolean flag = false;

    public static void main(String[] args) {
        P0801 main = new P0801();
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         int [] arr = new int[n];

         for (int i=0; i<n; i++) {
             arr[i] = sc.nextInt();
             total+=arr[i];
         }
         main.Dfs(0,0,arr);
        System.out.println(answer);
    }

    private void Dfs(int L, int sum, int[] arr) {
        if (flag==true){
            return;
        }
        if(L==n){
            if ((total-sum)==sum){
                answer = "YES";
                flag = true;
            }
        }else {
            Dfs(L+1,sum+arr[L],arr);
            Dfs(L+1,sum,arr);
        }
    }
}
