import java.util.LinkedList;

public class linkedlistAddition {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    static class Node2 {
        int data;
        Node next;

        Node2(int d){
            data = d;
            next = null;
        }
    }
    public static void main(String[] args){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        one.next = two;
        two.next = three;
        three.next = four;
        Node2 secondone = new Node2(1);
        Node2 secondtwo = new Node2(2);
        Node2 secondthree = new Node2(3);
        Node2 secondfour = new Node2(4);
        secondone.next = two;
        secondtwo.next = three;
        secondthree.next = four;

    }
}
