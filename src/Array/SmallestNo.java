package Array;

import java.util.HashMap;

public class SmallestNo {

    private int N;
    public SmallestNo(int N){
        this.N = N;
    }

    public void getSmallestNo(){
        int factor = 9;
        String ans = "";
        while(factor>1){
            while(N%factor ==0){
                N = N/factor;
                ans = factor+ans;
            }
            factor--;
        }
        if(N!=1) System.out.println(-1);
        else{
            System.out.println(Integer.parseInt(ans));
        }

    }
}
