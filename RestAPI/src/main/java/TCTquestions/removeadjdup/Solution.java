package TCTquestions.removeadjdup;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public String removeDuplicates(String A) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < A.length(); i++) {
            if (stack.isEmpty()) {
                stack.add(A.charAt(i));
            } else if (stack.peek() == A.charAt(i)) {
                stack.pop();
            } else {
                stack.add(A.charAt(i));
            }
        }
        String ans = "";
        while (!stack.isEmpty()) {
            ans = stack.pop() + ans;
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates("abbaca"));
    }
}