package practice.livecCoding.linkedlist;

public class LinkMain {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);

        System.out.println(numbers.removeFirst());
        System.out.println(numbers);
    }
}
