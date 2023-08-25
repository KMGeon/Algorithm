package practice.infrean.practice;

public class 재귀함수 {
    public static void main(String[] args) {
        재귀함수 main = new 재귀함수();
        int n =3;
        main.DFS(n);
    }

    private void DFS(int n) {
        if (n==0)return;
        DFS(n-1);//321
        System.out.println("n = " + n);
    }
}
