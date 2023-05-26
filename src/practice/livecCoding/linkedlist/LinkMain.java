package practice.livecCoding.linkedlist;

public class LinkMain {
    public static void main(String[] args) {
//        LinkedList numbers = new LinkedList();
//        numbers.addLast(10);
//        numbers.addLast(20);
//        numbers.addLast(30);
//
//        System.out.println(numbers.removeFirst());
//        System.out.println(numbers);
        LINKLIST numbers = new LINKLIST();
        numbers.addLast(11);
        numbers.addLast(21);
        numbers.addLast(31);
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers.node(i));
        }
    }
}
