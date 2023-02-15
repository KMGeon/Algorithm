package practice.infrean.BFS_DFS;

public class Fibonacci1 {
    public static void main(String[] args) {
        Fibonacci1 main = new Fibonacci1();
        System.out.println("main.DFS(7) = " + main.DFS(45));
//        main.DFS(7);
    }

    private int DFS(int n) {
        if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }else {
            return DFS(n-2)+DFS(n-1);
        }
    }
}
