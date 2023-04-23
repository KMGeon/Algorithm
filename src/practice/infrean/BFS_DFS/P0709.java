package practice.infrean.BFS_DFS;

class Node2 {
    int data;
    Node2 lt, rt;

    public Node2(int val) {
        data = val;
        lt = rt = null;
    }
}

public class P0709 {
    Node2 root;

    public int DFS(int level, Node2 root) {
        if (root.lt==null && root.rt==null){
            return level;
        }else {
            return Math.min(DFS(level+1 , root.lt),DFS(level+1 , root.rt));
        }
    }

    public static void main(String[] args) {
        P0709 tree = new P0709();
        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        System.out.println(tree.DFS(0,tree.root));
    }
}
