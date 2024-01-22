package TCTquestions.pickfrmbothside;

import quiz.abstracts.question27.A;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int[] pref = new int[n];
        int[] suff = new int[n];
        suff[n-1] = A.get(n - 1);
        pref[0] = A.get(0);
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i-1] + A.get(i);
            suff[n-1-i] = suff[n-i] + A.get(n-1-i);
        }
        int ans = Integer.MIN_VALUE;
        for (int j = 0;j <= B; j++) {
            if (j == 0) {
                ans = Math.max(ans, pref[B-j-1]);
            } else if (j == B) {
                ans = Math.max(ans,suff[n-B]);
            }else {
                ans = Math.max(ans,(pref[B-j-1] + suff[n-j]));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5,-2,3,1,2));
        System.out.println(new Solution().solve(A,3));
    }
}
