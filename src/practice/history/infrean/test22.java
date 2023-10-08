//package practice.etc.beak.infrean;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class test22 {
//
//    static int[] dx = {1, 0, 1, 0};
//    static int[] dy = {0, 1, 0, -1};
//    static int[][] board, dis;
//
//    public static void main(String[] args) {
//        test22 main = new test22();
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
//            System.out.println(dis[7][7]);
//        }else {
//            System.out.println(dis[7][7]);
//        }
//    }
//
//    //1. 큐 링크드 리스트
//    //2. x,y 큐에 offer
//    // 3. 시작점 1로 보드 체크
//    //4. while q.isemplty
//    //5. q.poll
//    //6. for 상하좌우 돌기
//    //7. if 상하좌우 조건
//    //8. nx,ny =1 체크, q에 nx,ny 넣기, 최단거리에 넣기
//
//    private void BFS(int x, int y) {
//        Queue<Point> q = new LinkedList<>();// 현재 위치에서 다음 탐색
//        q.offer(new Point(x, y));
//        board[x][y] = 1; //처음 시작점 체크
//        while (!q.isEmpty()) {
//            Point tmp = q.poll(); //현재 지점
//            for (int i = 0; i < 4; i++) {
//                int nx = tmp.x + dx[i];
//                int ny = tmp.y + dy[i];
//

                    //x는 1보다 크고 7보다 작다 y도 1보다 크고 7보다 작다. board[x][y] ==0
//                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
//                    board[nx][ny] = 1;
//                    q.offer(new Point(nx, ny));
//                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
//                }
//
//            }
//        }
//    }
//}
//
//
//class Point {
//    int x, y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}
