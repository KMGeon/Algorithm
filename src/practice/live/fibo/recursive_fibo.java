package practice.live.fibo;

public class recursive_fibo {

    public int fibo(int num) {
        if (num == 1) return 1;
        else if (num == 2) return 1;
        else return fibo(num - 2) + fibo(num - 1);
    }

    public static void main(String[] args) {
        recursive_fibo main = new recursive_fibo();

        int num = 7;

        for (int i = 1; i <= num; i++) {
            System.out.println("main.DFS(num) = " + main.fibo(i));
        }

    }

}
