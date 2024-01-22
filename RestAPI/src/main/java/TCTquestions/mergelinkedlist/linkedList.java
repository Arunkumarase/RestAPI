package TCTquestions.mergelinkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class linkedList {


    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2,5,3,6,87,9));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1,5,3,7,9,4,5,6,7,32,34,6,3,5,76));
        Collections.sort(a);
        Collections.sort(b);
        Node head = new CreateLinkedList(a).formLinkedList();
        Node head2 = new CreateLinkedList(b).formLinkedList();
        Node temp;
        if (head.val > head2.val) {
            temp = head2;
            head2 = head2.next;
        } else {
            temp = head;
            head = head.next;
        }
        Node newHead = temp;

        while (head != null && head2 != null) {
            if (head.val > head2.val) {
                temp.next = head2;
                head2 = head2.next;
            } else {
                temp.next = head;
                head = head.next;
            }
            temp = temp.next;
        }

        if (head == null && head2 == null) {
            new Displayll().displayList(newHead);
        } else if (head != null) {
            temp.next = head;
            new Displayll().displayList(newHead);
        } else {
            temp.next = head2;
            new Displayll().displayList(newHead);
        }
    }

}
