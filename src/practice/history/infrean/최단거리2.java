//package practice.etc.beak.infrean;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class 최단거리2 {
//    static int[] dx = {-1, 0, 1, 0};
//    static int[] dy = {0, 1, 0, -1};
//    static int[][] board, dis;
//
//    public static void main(String[] args) {
//        최단거리2 main = new 최단거리2();
//        Scanner sc = new Scanner(System.in);
//
//        board = new int[8][8];
//        dis = new int[8][8];
//        for (int i = 1; i <= 7; i++) {
//            for (int j = 1; j <= 7; j++) {
//                board[i][j] = sc.nextInt();
//            }
//        }
//        main.BFS(1, 1);
//        if (dis[7][7] == 0) {
//            System.out.println(-1);
//        } else {
//            System.out.println(dis[7][7]);
//        }
//    }
//
//    private void BFS(int x, int y) {
//         Queue<Point> q = new LinkedList<>();
//         q.offer(new Point(x,y));
//         board[x][y] = 1;
//        while (!q.isEmpty()) {
//            Point temp = q.poll();
//            for (int i = 0; i < 4; i++) {
//                int nx = temp.x + dx[i];
//                int ny = temp.y + dx[i];
//
//                if (nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7 && board[x][y] == 0) {
//                    board[nx][ny]=1;
//                    q.offer(new Point(nx,ny));
//                    dis[nx][ny] = dis[temp.x][temp.y] + 1;
//                }
//            }
//        }
//
//    }
//
////    private void BFS(int x, int y) {
////        Queue<Point> q = new LinkedList<>();
////        q.offer(new Point(x, y));
////        board[x][y] = 1;
////        while (!q.isEmpty()) {
////            Point tmp = q.poll();
////            for (int i = 0; i < 4; i++) {
////                int nx = tmp.x + dx[i];
////                int ny = tmp.y + dy[i];
////
////                // nx를 1로 변경
////                // 큐에 nx,ny 넣기
////                // dis의 nx,ny를 tmp.x,y +1 하기
////                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[x][y] == 0) {
////                    board[nx][ny] =1;
////                    q.offer(new Point(nx,ny));
////                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
////                }
////            }
////        }
////    }
//}
//
//class Point {
//    int x;
//    int y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}