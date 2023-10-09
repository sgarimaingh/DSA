package Array;

public class ThreeSum {
    private int [] arr = {7,-6,3,8,-1,8,-11};
    private int target = 0;
    int n = arr.length;

    public void get3Sum(){
        for(int i =0;i<n;i++){
            if(i==0 || arr[i]!=arr[i-1]) {
                int x = arr[i];
                int j = i + 1, k = n - 1;
                while (j < k) {
                    int sum = target - x;
                    if (arr[j] + arr[k] == sum) {
                        System.out.println(x + " " + arr[j] + " " + arr[k]);
                        while(j<k && arr[j]==arr[j+1]) j++;
                        while(j<k && arr[k]==arr[k-1]) k--;
                        j++;
                        k--;
                    }
                    if (arr[j] + arr[k] < sum) j++;
                    else if (arr[j]+arr[k]>sum) k--;
                }
            }

        }
    }
}
