package practice.infrean.BFS_DFS;

public class recursive2 {
    public static void main(String[] args) {

        recursive2 main = new recursive2();
        main.DFS(11);
    }

    private void DFS(int n) {
        if(n==0){
            return;
        }else {
            DFS(n/2);
            System.out.print(n%2+" ");
        }
    }

}
