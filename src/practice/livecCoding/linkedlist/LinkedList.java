package practice.livecCoding.linkedlist;


import java.awt.font.ImageGraphicAttribute;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0; //몇개의 element가 있는가

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

    private static class Node {
        private Object data;
        private Node next;

        //input : 처음에 가지고 있어야 하는 값
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
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
}
