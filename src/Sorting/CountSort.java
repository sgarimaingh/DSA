package Sorting;

public class CountSort {

    private int[] arr = {6,8,1,3,1,4,9,1,2,8,8,7};

    public void countSort(){
        int n= arr.length;

        int max = arr[0];
        for(int i =1;i<n;i++){
            max = Math.max(arr[i],max);
        }
        int[] p = new int[max+1];

        // frequency of each element
        for(int i =0;i<n;i++){
            p[arr[i]]++;
        }

        // prefix sum array
        for(int i=1;i<p.length;i++){
            p[i] = p[i-1]+p[i];
        }

        int[] ans = new int[n];
        // position of each element
        for(int i=n-1;i>=0;i--){
            int pos = p[arr[i]];
            ans[pos-1]= arr[i];
            p[arr[i]]--;
        }

        for(int x:ans){
            System.out.print(x + " ");
        }
    }
}
