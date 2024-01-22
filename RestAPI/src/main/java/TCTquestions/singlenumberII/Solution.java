package TCTquestions.singlenumberII;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int ans = 0;
        int temp;
        for (int i = 0; i < 32; i++) {
            temp = 1 << i;
            int count = 0;
            for (int j : A) {
                if ((temp & j) > 0) {
                    count += 1;
                }
            }
            if (count % 3 != 0) {
                ans = ans | temp;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1,2,4,3,3,2,2,3,1,1};
        System.out.println((new Solution().singleNumber(A)));
    }
}
