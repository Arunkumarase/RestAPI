package TCTquestions.rearrangeArrayAlternatively;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {

    // temp: input array
    // n: size of array
    // Function to rearrange  the array elements alternately.
    public static void rearrange(ArrayList<Integer> arr) {

        // Your code here
        Collections.sort(arr);
        int n = arr.size();
        int min = 0, max = n-1, factor= arr.get(n-1) +1;
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                //put max element on even index
                arr.set(i,arr.get(i) + ((arr.get(max)%factor)*factor));
                max--;
            }else{
                arr.set(i,arr.get(i) + ((arr.get(min)%factor)*factor));
                min++;
            }
        }
        for(int i=0;i<n;i++){
            arr.set(i,arr.get(i)/factor);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        new TCTquestions.rearrangeArrayAlternatively.Solution().rearrange(A);
        //System.out.println(A);
        System.out.println(0x55555555);
    }
}
