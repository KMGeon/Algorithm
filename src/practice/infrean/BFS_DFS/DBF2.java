package practice.infrean.BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;

class Node3 {
    int data;
    Node3 lt, rt;

    public Node3(int val) {
        data = val;
        lt = rt = null;
    }
}


public class DBF2 {
    Node3 root;

    public int BFS3(Node3 root) {
        Queue<Node3> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node3 current = queue.poll();
                if (current.lt == null && current.rt == null) {
                    return level;
                }

                if (current.lt !=null){
                    queue.offer(current.lt);
                }
                if (current.rt!=null){
                    queue.offer(current.rt);
                }
            }
            level++;
        }

        return 0;
    }

    public static void main(String[] args) {
        DBF2 tree = new DBF2();
        tree.root = new Node3(1);
        tree.root.lt = new Node3(2);
        tree.root.rt = new Node3(3);
        tree.root.lt.lt = new Node3(4);
        tree.root.lt.rt = new Node3(5);
        System.out.println(tree.BFS3(tree.root));
    }
}
