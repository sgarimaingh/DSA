package Sorting;

public class RadixSort {

    private int[] arr = {170,79,608,721,9,99,199,10};

    public void radixSort(){
        int n= arr.length;

        int max = arr[0];
        for(int i =1;i<n;i++){
            max = Math.max(arr[i],max);
        }
        int exp=1;
        while(max>0){
            max /= 10;
            countSort(arr, exp);
            exp*=10;
        }

        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    private void countSort(int[] arr, int exp){
        int n = arr.length;
        int[] p = new int[10];

        // frequency of each element
        for(int i =0;i<n;i++){
            p[(arr[i]/exp)%10]++;
        }

        // prefix sum array
        for(int i=1;i<p.length;i++){
            p[i] = p[i-1]+p[i];
        }

        int[] ans = new int[n];
        // position of each element
        for(int i=n-1;i>=0;i--){
            int pos = p[(arr[i]/exp)%10];
            ans[pos-1]= arr[i];
            p[(arr[i]/exp)%10]--;
        }

        for(int i=0;i<n;i++){
           arr[i] = ans[i];
        }
    }
}
