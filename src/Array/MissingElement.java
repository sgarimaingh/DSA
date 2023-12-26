package Array;

public class MissingElement {

    private int[] arr={ 1, 2, 3, 5 };

    public int getMissingElement(){
        int n = arr.length;
        System.out.println(n);
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        return (((n+1) * (n+2))/2 - sum);
    }
}
