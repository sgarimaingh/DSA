package Sorting;

public class Sort01 {

    private int[] arr = {0,1,1,0,1,0,1,1,0,0,1,0,1,1};

    public void sort(){
        int n= arr.length;
        int i =0,j=0;
        while(i<n){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else i++;
        }
        for(int val:arr){
            System.out.print(val +" ");
        }
    }
}
