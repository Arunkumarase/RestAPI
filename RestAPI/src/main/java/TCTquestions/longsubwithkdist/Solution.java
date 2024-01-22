package TCTquestions.longsubwithkdist;

public class Solution {
    public int solve(String A, int B) {
        int[] freq = new int[26];
        int num = 0;
        int i = 0;
        int ans = 0;
        for (int j = 0; j < A.length(); j++) {
            if (freq[A.charAt(j) - 'a'] == 0) {
                num += 1;
            }
            freq[A.charAt(j) - 'a'] += 1;
            while (num > B) {
                freq[A.charAt(i) - 'a'] -= 1;
                if (freq[A.charAt(i) - 'a'] == 0) {
                    num -= 1;
                }
                i++;
            }
            ans = Math.max(ans,(j-i+1));

        }
        return ans;
    }

    public static void main(String[] args) {
        String a = "adbcaa";
        System.out.println(new Solution().solve(a,3));
    }
}
