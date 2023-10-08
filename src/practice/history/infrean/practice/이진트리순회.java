package practice.history.infrean.practice;

public class 이진트리순회 {

    Node root;

    public void DFS(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.println(root.data);
            DFS(root.lt);
            DFS(root.rt);
        }
    }

    public static void main(String[] args) {
        이진트리순회 main = new 이진트리순회();
        main.root = new Node(1);
        main.root.lt= new Node(2);
        main.root.rt= new Node(3);
        main.root.lt.lt= new Node(4);
        main.root.lt.rt= new Node(5);
        main.root.rt.lt= new Node(6);
        main.root.rt.rt= new Node(7);

        main.DFS(main.root);

    }
}

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
