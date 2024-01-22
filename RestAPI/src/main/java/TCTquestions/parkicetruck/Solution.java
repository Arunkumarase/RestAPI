package TCTquestions.parkicetruck;

import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {

        Deque<Node> queue = new LinkedList<>();

        ArrayList<Integer> ans = new ArrayList<>();
        int val;
        Node temp;

        for (int i = 0; i < B; i++) {
            val = A.get(i);
            while (!queue.isEmpty() && queue.peekLast().val <= val) {
                queue.pollLast();
            }
            temp = new Node(i,val);
            queue.add(temp);
        }
        ans.add(queue.peekFirst().val);
        int i = B;
        while (i < A.size()) {
            while (!queue.isEmpty()) {
                if (queue.peekLast().val < A.get(i)) {
                    queue.pollLast();
                } else {
                    break;
                }
            }
            val = A.get(i);
            temp = new Node(i,val);
            queue.add(temp);

            //System.out.println(queue.element().get(0));
            while (i-B+1 > queue.peekFirst().index) {
                queue.pollFirst();
            }
            ans.add(queue.peekFirst().val);
            i++;
        }
        return ans;


    }
    class Node {
        public int index;
        public int val;

        public Node(int index, int val) {
            this.val = val;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(648 ,614 ,490, 138 ,657 ,544, 745, 582 ,738 ,229 ,775, 665, 876, 448, 4 ,81 ,807, 578, 712,
                951 ,867, 328, 308 ,440 ,542, 178, 637, 446, 882, 760, 354, 523, 935, 277, 158, 698, 536, 165, 892, 327, 574,
                516, 36, 705, 900, 482, 558, 937, 207, 368));
        System.out.println(new Solution().slidingMaximum(list,9));
    }
}
