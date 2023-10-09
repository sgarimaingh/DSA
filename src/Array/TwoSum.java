package Array;

import java.util.*;

public class TwoSum {

    private int[] arr = {11, 7, 9, 3, 6, 8};
    private int target = 19;

    public int[] getAns(){

        int[] ans = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int x = target - arr[i];
            if(mp.containsKey(x)){
                ans[0] = mp.get(x);
                ans[1] = i;
            }
            else {
                mp.put(arr[i], i);
            }
        }
        return ans;
    }

}
