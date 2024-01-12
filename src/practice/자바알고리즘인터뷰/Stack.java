package practice.자바알고리즘인터뷰;

public class Stack {
    public static void main(String[] args) {
        MyNode myNode = new MyNode();
        myNode.push(1);
        myNode.push(2);
        myNode.push(3);

        System.out.println(myNode.pop());
        System.out.println(myNode.pop());
        System.out.println(myNode.pop());
    }
}

class MyNode {
    int item;
    MyNode next;
    MyNode last;

    public MyNode(int item, MyNode next) {
        this.item = item;
        this.next = next;
    }

    // 최초 스택 생성시 마지막 노드는 없음
    public MyNode() {
        this.last = null;
    }

    public void push(int item) {
        MyNode newNode = new MyNode(item, null);
        if (last == null) {
            last = newNode;
        } else {
            newNode.next = last;
            last = newNode;
        }
    }

    public int pop() {
        if (last == null) {
            return -1;
        } else {
            int item = last.item;
            last = last.next;
            return item;
        }
    }
}

