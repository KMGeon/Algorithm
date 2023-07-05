package practice.livecCoding;

import java.sql.SQLOutput;

class 재귀함수 {

    private int flag = 0;

    private void DFS(int i) {
        if (i == 0) {
            return;
        } else {
            flag +=i;
            System.out.println("flag"+flag+"::::"+"num"+i);
            DFS(i - 1);
        }
    }

    public static void main(String[] args) {
        재귀함수 main = new 재귀함수();
        int num =3;
        main.DFS(num);
    }
}
