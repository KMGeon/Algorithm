package practice.history.infrean.practice;

/**
 * 재귀함수는 stack frame에 호풀이 된다.
 */
public class dfs1 {
    public static void main(String[] args) {
        dfs1 main = new dfs1();
        int n = 3;
        main.dfs(n);
    }

    public void dfs(int n) {
        if (n == 0) {
            return;
        } else {
            dfs(n - 1);
            System.out.println(n);
        }

    }
}
