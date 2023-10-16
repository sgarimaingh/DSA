package Sorting;

public class Merge2SortedArrays {
    private int[] arr1 = {2,3,8,10,15};
    private int[] arr2 = {3,5,7,11};

    public void merge(){
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

        for(int x: ans){
            System.out.print(x+" ");
        }
    }
}
