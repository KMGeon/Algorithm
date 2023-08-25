package practice.infrean.practice;

public class 팩토리얼 {
    public static void main(String[] args) {
        팩토리얼 main = new 팩토리얼();
        int n =5;
        System.out.println("main = " + main.DFS(n));
    }

    private int DFS(int n) {
        if (n == 0) return 1;
        else {
            return n*DFS(n-1);
        }
    }
}
