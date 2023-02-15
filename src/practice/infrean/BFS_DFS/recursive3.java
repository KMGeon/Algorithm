package practice.infrean.BFS_DFS;

public class recursive3 {
    public static void main(String[] args) {

        recursive3 main = new recursive3();
        main.DFS(5);
        System.out.println("main.DFS(5) = " + main.DFS(5));
    }

    private int DFS(int i) {
        int answer = 1;
        if (i == 1) {
            return 1;
        } else {
            return i * DFS(i - 1);
        }
    }
}
