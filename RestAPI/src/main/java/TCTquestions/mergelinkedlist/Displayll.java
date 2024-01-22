package TCTquestions.mergelinkedlist;

public class Displayll {

    public void displayList (Node a){
        Node show = a;

        while (show != null) {
            System.out.println(show.val);
            show = show.next;
        }
    }
}
