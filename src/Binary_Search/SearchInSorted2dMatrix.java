package Binary_Search;

public class SearchInSorted2dMatrix {

    private static int[][] a= {{1,4,6,8,10},
        {2,7,9,12,15},
        {3,11,20,22,24},
        {5,16,25,30,40}};

    private static int x = 11;

    public boolean getTarget(){
        int m = a.length;
        int i=0, j = m-1;

        while(i<m && j>=0){
            if(a[i][j]==x) return true;
            else if(a[i][j]<x) i++;
            else j--;
        }
        return false;


    }

}
