package Array;

public class MajorityElement {
      private int [] arr = {4,4,3,7,5,4,5,4,6,4,4,3,7,4,4};

      public int getMajorityElement(){
            int n = arr.length;
            int candidate = arr[0];
            int count=1;

            for(int i=1;i<n;i++){
                  if(arr[i]==candidate){
                        count++;
                  }
                  else count--;
                  if(count ==0){
                        candidate = arr[i];
                        count=1;
                  }
            }
            int freq = 0;
            for(int x:arr){
                  if(x==candidate)
                        freq++;
            }
            if(freq>n/2) return candidate;
            else return -1;

      }
}
