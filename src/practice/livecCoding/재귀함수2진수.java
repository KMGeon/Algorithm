package practice.livecCoding;

public class 재귀함수2진수 {
    public static void main(String[] args) {
        재귀함수2진수 main = new 재귀함수2진수();
        int num =11;
        main.DFS(11);
    }

    public void DFS(int i) {
        if (i == 0) {
            return;
        } else {
            System.out.println(i%2);
            DFS(i/2);
        }
    }
}
