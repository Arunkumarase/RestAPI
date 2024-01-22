package TCTquestions.sum3zero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<>();
        Collections.sort(A);

        for (int low = 0; low < A.size()-2; low++) {
            int mid = low + 1;
            int end = A.size()-1;
            int sum = -A.get(low);
            if ((low > 0) && (A.get(low).intValue() == A.get(low-1).intValue())) {
                continue;
            } else {
            while (mid < end) {

                int num = A.get(mid) + A.get(end);
                if (num  == sum) {
                    temp.add(A.get(low));
                    temp.add(A.get(mid));
                    temp.add(A.get(end));
                    Collections.sort(temp);
                    if (!ans.contains(temp)) {
                        ans.add(new ArrayList<>(temp));
                    }
                    temp.clear();
                    mid += 1;
                    end -= 1;
                } else if (sum < num) {
                    end -= 1;
                } else {
                    mid += 1;
                }
            }
        }
            }
        return ans;

    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,-4,0,0,5,-5,1,0,-2,4,-4, 1, -1, -4, 3, 4, -1, -1, -3));
        System.out.println(new Solution().threeSum(A));
    }
}

/*ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            for (int j = i+1; j < A.size(); j++) {
                //temp = null;
                for (int k = j+1; k < A.size(); k++) {
                    if ((A.get(i) + A.get(j) + A.get(k)) == 0) {
                        temp.add(A.get(i));
                        temp.add(A.get(j));
                        temp.add(A.get(k));
                        Collections.sort(temp);
                        if (!ans.contains(temp)) {
                            ans.add(new ArrayList<>(temp));
                        }
                        temp.clear();
                    }
                }

            }
        }
        return ans;*/
