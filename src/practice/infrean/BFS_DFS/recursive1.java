package practice.infrean.BFS_DFS;

public class recursive1 {
    private void DFS(int i) {//깊이 우선 탐색
        if (i == 0) {
            return;
        } else {
            DFS(i - 1);
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        recursive1 main = new recursive1();
        main.DFS(3);//-> DFS(3) ->DFS(2) -> DFS(1)
    }
}
//재귀 함수는 stack 프레임에 쌓인다.