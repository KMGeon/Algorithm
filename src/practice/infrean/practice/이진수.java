package practice.infrean.practice;

public class 이진수 {
    public static void main(String[] args) {
        이진수 main = new 이진수();
        main.dfs(11);
    }

    public void dfs(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(n%2);
            dfs(n / 2);
        }
    }
}
