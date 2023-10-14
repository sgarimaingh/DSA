package Sorting;

public class Sort012 {
    private int[] arr = {0,1,1,0,2,1,0,2,0,2,1};

    public void sort012(){
        int n = arr.length;
        int i =0,j=0,k=n-1;
        while(i<=k){
            if(arr[i]==0){
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else if(arr[i]==2){
                int temp = arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k--;
            }
            else if (arr[i]==1){
                i++;
            }
        }
        for(int val:arr){
            System.out.print(val +" ");
        }
    }
}
