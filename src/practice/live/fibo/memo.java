package practice.live.fibo;

public class memo {
    static int[] fibo;

    public static void main(String[] args) {
        memo main = new memo();
        int n = 10;

        fibo = new int[n + 1];
        main.DFS(n);

        for (int i = 1; i <= n; i++) {
            System.out.println(fibo[i]);
        }
    }

    private int DFS(int i) {
        if (i == 1) return fibo[i]=1;
        else if (i == 2) return fibo[i]=1;
        else return fibo[i] = DFS(i - 2) + DFS(i - 1);
    }
}
