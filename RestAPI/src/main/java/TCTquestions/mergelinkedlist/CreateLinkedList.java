package TCTquestions.mergelinkedlist;

import java.util.ArrayList;

public class CreateLinkedList {
    ArrayList<Integer> x;
    Node head;
    public CreateLinkedList (ArrayList<Integer> x) {
        this.x = x;
    }

    public Node formLinkedList() {
        Node head = new Node(0);
        Node temp = head;

        for (Integer i : this.x) {
            temp.next = new Node(i);
            temp = temp.next;
        }
        return head.next;
    }
}
