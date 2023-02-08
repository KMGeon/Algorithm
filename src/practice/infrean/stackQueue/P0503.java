package practice.infrean.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class P0503 {
    public static void main(String[] args) {
        P0503 main = new P0503();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]board = new int [n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[]moves = new int[m];
        for (int i=0;i<m;i++){
            moves[i]=sc.nextInt();
        }
        System.out.println(main.solution(board,moves));
    }

    private int solution(int[][] board, int[] moves) {
        int answer=0;
        Stack<Integer> stack = new Stack<>();

        for (int pos : moves){
            for (int i=0;i<board.length;i++){
                if(board[i][pos-1]!=0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1] =0;
                    if(!stack.isEmpty()&&tmp==stack.peek()){
                        answer+=2;
                        stack.pop();
                    }else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }

        return answer;
    }
}