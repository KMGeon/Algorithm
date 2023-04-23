package practice.infrean.BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class DFS1 {
    Node root;

    public void DFS(Node root) {//node root -> 1번 노드
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int Level=1; //level
        while (!queue.isEmpty()){
            int len = queue.size();
            System.out.println("Level = " + Level);
            System.out.println("len = " + len);
            for (int i=0;i<len;i++){
                Node currentNode = queue.poll();
                System.out.println("currentNode = " + currentNode.data);
                if(currentNode.lt!=null){
                    queue.offer(currentNode.lt);
                }
                if(currentNode.rt!= null){
                    queue.offer(currentNode.rt);
                }
            }
            Level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DFS1 tree = new DFS1();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
