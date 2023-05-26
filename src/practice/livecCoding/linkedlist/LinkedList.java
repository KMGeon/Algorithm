package practice.livecCoding.linkedlist;


import java.awt.font.ImageGraphicAttribute;

public class LinkedList {
    // 머리 꼬리
    private Node head;
    private Node tail;
    private int size = 0; //몇개의 element가 있는가

    //노드 데이터 + 다음
    private static class Node {
        private Object data;
        private Node next;

        //input : 처음에 가지고 있어야 하는 값
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }
    }


    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(int input) {
        Node newNode = new Node(input);
        if (size == 0) {
            addFirst(input);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }


    public Node node(int index) {
        Node x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public void add(int k, Object input) {
        if (k == 0) {
            addFirst(input);
        } else {
            Node tmp = node(k - 1);
        }
    }

    //삭제 1
    public Object removeFirst() {
        Node temp = head;
        head = head.next;
        Object retunData = temp.data;
        temp = null;
        size--;
        return retunData;
    }

    //index 삭제
    public Object remove(int k) {
        if (k == 0) {
            return removeFirst();
        }
        Node temp = node(k - 1);
        Node todoDeleted = temp.next;//삭제하려는 노드
        temp.next = temp.next.next;
        Object returnData = todoDeleted.data;

        if (todoDeleted == tail) {
            tail = temp;
        }
        todoDeleted = null;
        size--;
        return todoDeleted;
    }
}
