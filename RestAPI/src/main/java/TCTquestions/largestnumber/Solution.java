package TCTquestions.largestnumber;

import org.hibernate.dialect.function.array.AbstractArrayTrimFunction;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public String largestNumber(ArrayList<Integer> A) {
        ArrayList<Integer> temp = new ArrayList<>(A);
        ListIterator<Integer> listIterator = temp.listIterator(temp.size());
        System.out.println(listIterator.toString());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        temp.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String a = String.valueOf(o1) + String.valueOf(o2);
                String b = String.valueOf(o2) + String.valueOf(o1);
                return b.compareTo(a);
            }
        });
        System.out.println(temp);
        StringBuilder ans = new StringBuilder();
        for (int i : temp) {
            ans.append(String.valueOf(i));
        }
        return ans.toString();
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,30,34,5,9));
        System.out.println(new Solution().largestNumber(list));
    }


}

