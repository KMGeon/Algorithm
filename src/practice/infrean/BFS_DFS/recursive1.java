package practice.infrean.BFS_DFS;

public class recursive1  {
    public static void main(String[] args) {

        recursive1 main = new recursive1();
        main.DFS(3);
    }

    private void DFS(int i) {
        if (i==0){
            return;
        }else {
        DFS(i-1);
        System.out.print(i+" ");
        }
    }
}
//재귀 함수는 stack 프레임에 쌓인다.