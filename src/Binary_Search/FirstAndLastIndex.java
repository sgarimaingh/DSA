package Binary_Search;

public class FirstAndLastIndex {

    private int[] arr = {1,2,3,4,5,5,5,5,6,7};

    private int X = 5;

    public void getFirstAndLastIndex(){
        int n = arr.length;
        int left = 0, right = n-1;

        // for first index
        int first =-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==X){
                first = mid;
                right = mid-1;
            }
            else if (arr[mid]<X) left++;
            else right--;
        }

        left = 0;
        right = n-1;

        // for last index
        int last =-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==X){
                last = mid;
                left = mid+1;
            }
            else if (arr[mid]<X) left++;
            else right--;
        }
        System.out.println(first + ", " + last);


    }
}
