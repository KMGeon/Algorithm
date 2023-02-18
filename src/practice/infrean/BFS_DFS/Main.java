//package practice.infrean.BFS_DFS;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//class Node {
//    int data;
//    Node lt, rt;
//
//    public Node(int val) {
//        data = val;
//        lt = rt = null;
//    }
//}
//
//public class Main {
//    Node root;
//
//    public void DFS(Node root) {//root -> 1번 데이터 node
//        if(root ==null){
//            return;
//        }else {
//            DFS(root.lt);
//            System.out.println("root = " + root.data);
//            DFS(root.rt);
//
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Main tree = new Main();
//        tree.root = new Node(1);
//        tree.root.lt = new Node(2);
//        tree.root.rt = new Node(3);
//        tree.root.lt.lt = new Node(4);
//        tree.root.lt.rt = new Node(5);
//        tree.root.rt.lt = new Node(6);
//        tree.root.rt.rt = new Node(7);
//        tree.DFS(tree.root);
//    }
//}