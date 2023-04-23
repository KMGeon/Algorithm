package practice.infrean.BFS_DFS;

public class fibo2 {
    static int[] fibo2;

    public int DFS1(int n) {
        if (n == 1) return fibo2[n]=1;
        else if (n == 2) return fibo2[n]=1;
        else return fibo2[n] = DFS1(n - 2) + DFS1(n - 1);
    }

    public static void main(String[] args) {
        fibo2 T = new fibo2();
        int n = 10;
        fibo2 = new int[n + 1];
        T.DFS1(n);
        for (int i = 1; i <= n; i++) {
            System.out.println(fibo2[i]);
        }
    }

}
