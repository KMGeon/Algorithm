package practice.infrean.practice;

public class 이진수출력 {
    public static void main(String[] args) {
        이진수출력 main = new 이진수출력();

        main.DFS(11);
    }

    private void DFS(int n) {
        if(n==0)return;
        DFS(n/2);
        System.out.print(n%2);
    }
}
