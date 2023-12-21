package Array;

public class TrappingRainWater {

    private int[] arr = {3,0,2,0,4};

    public int getWater(){
        int n= arr.length;
        int i=0,j=n-1;
        int left =arr[0];
        int right = arr[n-1];
        int sum=0;
        while(i<=j){
            left = Math.max(left,arr[i]);
            right = Math.max(right, arr[j]);
            if(right<=left){
                sum+=(right-arr[j]);
                j--;
            }
            else {
                sum+=(left-arr[i]);
                i++;
            }
        }
        return sum;


    }
}
