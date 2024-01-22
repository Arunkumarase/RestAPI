package geeksforgeeks;

import jakarta.persistence.criteria.CriteriaBuilder;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hibernate.internal.util.collections.ArrayHelper.contains;

public class Solution {

    public int solve(int A) {

        HashMap<Integer, Integer> spf = new HashMap<>();
        for (int i = 1; i <= A;i++){
            spf.put(i,0);
        }
        for (int i = 2;i <= A; i++){
            if (spf.get(i) == 0){
                spf.put(i,i);
            }
            for (int j = i*i;j <= A;j += i){
                if (spf.get(j) == 0){
                    spf.put(j,i);
                }
            }
        }
        return 1;

    }

}
/*    static int countTriplet(int[] arr, int n) {
        // code here
        int count = 0;
        List<Integer> list = arr;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (contains(arr,(arr[i] + arr[j]))) {
                    count += 1;
                }
            }
        }
        return count;
    }*/




/*        //Function to find a continuous sub-array which adds up to a given number.
        static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
        {
            // Your code here
            int i = 0;
            int j = 1;
            int sum = arr[0];
            ArrayList<Integer> arr1 = new ArrayList<>();

            if ((arr.length == 1) && (arr[0] == s)){
                arr1.add(1);
                arr1.add(1);
                return arr1;
            }

            while (j < arr.length){
                if (sum == s){
                    arr1.add(i+1);
                    arr1.add(j+1);
                    return arr1;
                }else if (sum < s){
                    sum += arr[j];
                    j += 1;
                }else {
                    if (i < j) {
                        sum -= arr[i];
                        i += 1;
                    }else {
                        sum -= arr[i];
                        i += 1;
                        j += 1;
                    }

                }

            }
            if (sum == s){
                arr1.add(i+1);
                arr1.add(j+1);
                return arr1;
            }
            arr1.add(-1);
            return arr1;
        }*/
