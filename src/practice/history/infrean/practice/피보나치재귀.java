package practice.history.infrean.practice;

public class 피보나치재귀 {
    public static void main(String[] args) {
        피보나치재귀 main = new 피보나치재귀();
        int n = 5;
        System.out.println(main.DFS(n));
    }

    private int DFS(int n) {
        if (n == 1) return 1;
        else if (n == 2) {
            return 1;
        } else {
            return DFS(n - 2) + DFS(n - 1);
        }
    }
}
