package Sorting;

public class MergeSort {

    private int[] arr = {2,1,5,3,6,4,8,7,3};
    int n= arr.length;

    public void getSortedArray(){
        int[] ans = mergeSort(arr, 0, n-1);
        for(int x: ans){
            System.out.print(x+" ");
        }

    }

    private int[] mergeSort(int[] arr, int low, int high){
        if(low==high){
            int[] res = new int[1];
            res[0] = arr[low];
            return res;
        }
        int mid = (low+high)/2;
        int[] leftArray = mergeSort(arr,low,mid);
        int[] rightArray = mergeSort(arr,mid+1, high);
        return merge(leftArray,rightArray);
    }

    private int[] merge(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int [] ans = new int[n1+n2];
        int k =0;
        int i =0,j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                ans[k++]=arr1[i++];
            }
            else {
                ans[k++]=arr2[j++];
            }
        }
        while(i<n1){
            ans[k++]=arr1[i++];
        }
        while(j<n2){
            ans[k++]=arr2[j++];
        }

        return ans;
    }
}
