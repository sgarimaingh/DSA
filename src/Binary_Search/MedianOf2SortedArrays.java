package Binary_Search;

public class MedianOf2SortedArrays {

    private int [] A = {1,3,8,9,15};
    private int [] B = {7,11,18,19,21,25};


    public double result(){
        return getMedian(A,B);
    }

    private double getMedian(int [] A, int [] B){
        int  x = A.length;
        int y = B.length;
        if(x>y) return getMedian(B,A);

        int start =0, end=x;
        while(start<=end){
            int partitionX =  (start+end)/2;
            int partitionY = (x+y+1)/2 - partitionX;

            // if partitionX==0, means there is nothing on left side, assign -INF to maxLeftX
            // similarly for other partitions

            int maxLeftX = (partitionX==0)? Integer.MIN_VALUE: A[partitionX-1];
            int minRightX = (partitionX == x)? Integer.MAX_VALUE: A[partitionX];

            int maxLeftY = (partitionY==0)? Integer.MIN_VALUE: B[partitionY-1];
            int minRightY = (partitionY==y)?Integer.MAX_VALUE:B[partitionY];

            if(maxLeftX<=minRightY && maxLeftY<=minRightX){
                if((x+y)%2!=0) return (double)Math.max(maxLeftX,maxLeftY);
                else{
                    return ((double)Math.max(maxLeftX,maxLeftY) + Math.min(minRightX,minRightY))/2;
                }
            }
            if(maxLeftX>minRightY) end = partitionX-1;
            else start = partitionX+1;

        }
        return 0;
    }
}
