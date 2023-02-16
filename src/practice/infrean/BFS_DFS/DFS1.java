package practice.infrean.BFS_DFS;

class Node{
    int data;
    Node lt , rt;
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}

public class DFS1  {
    Node root;
    public void DFS(Node root){//node root -> 1번 노드
        if(root== null){
            return;
        }else{
//            System.out.print("root1: = " + root.data+" ");//앞에다 sout를 하면 전이순회
            DFS(root.lt);
            System.out.println("root.data = " + root.data+" "); //중위 순외
            DFS(root.rt);
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
        tree.root.rt.rt = new Node(7 );
        tree.DFS(tree.root);
    }
}
