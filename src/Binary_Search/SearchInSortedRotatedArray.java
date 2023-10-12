package Binary_Search;

public class SearchInSortedRotatedArray {

    private int[] arr = {9,11,14,15,20,22,25,2,3,5,7};
    private int x = 5;

    private int n = arr.length;


    public void getIndex(){
        int minIdx = findMin();
        int ans = BinarySearch(0, minIdx-1);
        if(ans==-1){
            ans = BinarySearch(minIdx, n-1);
        }
        System.out.println(ans);
    }


    private int BinarySearch(int left, int right){

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if (arr[mid]<x) left = mid+1;
            else right = mid-1;
        }
        return -1;
    }

    private int findMin(){
        int left =0,right = n-1;
        while(left<right){
            int mid = (left+right)/2;
            if (arr[mid]<arr[right]) right = mid;
            else left = mid+1;
        }
        return left;
    }


}
